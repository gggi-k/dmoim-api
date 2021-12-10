package kr.dmoim.core.domain.code.template;

public interface DomainCodeTemplate {

    String code();

    String name();

    default String primaryOption() {
        return null;
    };

    default String secondaryOption() {
        return null;
    };

}
