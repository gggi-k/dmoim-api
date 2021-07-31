package kr.dmoim.user.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean findUserAll () {
        return true;
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    public String findUserById (@PathVariable final String userId) {
        return userId;
    }

    @RequestMapping(value = "/duplicate/{userId}", method = RequestMethod.HEAD)
    public void isDuplicateByUserId (@PathVariable String userId) {

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public boolean createUser () {
        return false;
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.CREATED)
    public String updateUserById (@PathVariable final String userId) {
        return userId;
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String removeUserById (@PathVariable final String userId) {
        return userId;
    }
}
