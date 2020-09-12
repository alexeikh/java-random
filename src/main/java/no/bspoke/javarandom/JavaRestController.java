package no.bspoke.javarandom;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/api")
public class JavaRestController {
    @GetMapping("/random-number")
    RandomNumberContainer getRandomNumber(@RequestParam(defaultValue = "6") int max)  {
        int randomNumber = generateRandomNumber(max);
        return new RandomNumberContainer(randomNumber);
    }

    @PostMapping("/random-number")
    RandomNumberContainer getRandomNumberByPost(@RequestBody MaxNumberContainer maxNumberContainer) {
        int max = maxNumberContainer.getMax();
        int randomNumber = generateRandomNumber(max);
        return new RandomNumberContainer(randomNumber);
    }

    int generateRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max) + 1;
    }
}
