package kr.dmoim.domain.cofing;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import kr.dmoim.r2dbc.convert.BooleanToYNConverter;
import kr.dmoim.r2dbc.convert.EmailToStringConverter;
import kr.dmoim.r2dbc.convert.PasswordToStringConverter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.connection.R2dbcTransactionManager;
import org.springframework.transaction.ReactiveTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@Configuration
@EnableR2dbcRepositories(basePackages = "kr.dmoim.domain.user")
@EnableTransactionManagement
public class UserR2dbcConfig extends AbstractR2dbcConfiguration {

    private static final String CONNECTION_FACTORY_BEAN = "dmoimConnectionFactory";

    @Bean(CONNECTION_FACTORY_BEAN)
    @Override
    public ConnectionFactory connectionFactory() {

        return ConnectionFactories.get(ConnectionFactoryOptions.builder()
                .option(ConnectionFactoryOptions.DRIVER, "mysql")
                .option(ConnectionFactoryOptions.PROTOCOL, "r2dbc")
                .option(ConnectionFactoryOptions.HOST, "localhost")
                .option(ConnectionFactoryOptions.PORT, 3306)
                .option(ConnectionFactoryOptions.USER, "root")
                .option(ConnectionFactoryOptions.PASSWORD, "DMOIMSYSTEM2021@")
                .option(ConnectionFactoryOptions.DATABASE, "dmoim_user")
                .build());
    }

    @Override
    protected List<Object> getCustomConverters() {
        return List.of(
            new BooleanToYNConverter.YNReadConverter(),
            new BooleanToYNConverter.YNWriteConverter(),
            new EmailToStringConverter.EmailReadConverter(),
            new EmailToStringConverter.EmailReadConverter(),
            new PasswordToStringConverter.PasswordReadConverter(),
            new PasswordToStringConverter.PasswordWriteConverter()
        );
    }

    @Bean
    public ReactiveTransactionManager reactiveTransactionManager(@Qualifier(CONNECTION_FACTORY_BEAN) ConnectionFactory connectionFactory) {
        return new R2dbcTransactionManager(connectionFactory);
    }

    @Bean
    public R2dbcEntityTemplate userR2dbcEntityTemplate(@Qualifier(CONNECTION_FACTORY_BEAN) ConnectionFactory connectionFactory) {
        return new R2dbcEntityTemplate(connectionFactory);
    }

}
