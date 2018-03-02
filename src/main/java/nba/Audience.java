package nba;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {
    /*@Before("execution(* nba.ShowPlayer.play(..))")
    public void takeSeats() {1

    }
    @AfterReturning("execution(* nba.ShowPlayer.play(..))")
    public void gameOver() {
         System.out.println("The game is over, let's go home.");
    }*/

    @Pointcut("execution(* nba.ShowPlayer.play(..))")
    public void watch() {}

    @Around("watch()")
    public void watchGame(ProceedingJoinPoint jp) {
        try {
            System.out.println("Audience take seats !!!!!!");
            jp.proceed();
            System.out.println("The game is over, let's go home.");
        } catch (Throwable e) {
            System.out.println("WTF!!!");
        }
    }

}
