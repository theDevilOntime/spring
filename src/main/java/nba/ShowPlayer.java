package nba;

import org.springframework.beans.factory.annotation.Autowired;

public class ShowPlayer implements Player {

    Team t;Jersy j;Name n;

    @Autowired
    public ShowPlayer(Team t,Jersy j,Name n) {
        this.t = t;
        this.j = j;
        this.n = n;
    }
    public void play()  {
        System.out.println("this is "+ this.n.getName() +" with "+this.j.getNumber()+" play in " + this.t.getTeam());
    }
}
