package generic;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer pat = new FootballPlayer("pat");
        FootballPlayer lewy = new FootballPlayer("lewy");

        Team<FootballPlayer> footballPlayerTeam = new Team<>("Banda łysego");
        footballPlayerTeam.addPlayer(joe);
        footballPlayerTeam.addPlayer(pat);
        footballPlayerTeam.addPlayer(lewy);

        System.out.println(footballPlayerTeam.ranking());
        System.out.println(footballPlayerTeam.played);

        Team<FootballPlayer> anotherFootballTeam = new Team<>("AAAAAA");
        FootballPlayer karamba = new FootballPlayer("Karamba");

        anotherFootballTeam.addPlayer(karamba);

        BaseballPlayer kakkarekokko = new BaseballPlayer("Kakkarekokko");
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Kury na grzędzie");

        baseballPlayerTeam.addPlayer(kakkarekokko);

        System.out.println(baseballPlayerTeam.ranking());

        LeagueTable<Team<FootballPlayer>> footballLeague = new LeagueTable<>("Puchar Cebuli");
        footballLeague.add(footballPlayerTeam);
        footballLeague.add(anotherFootballTeam);

        footballLeague.showLeagueTable();

        BaseballPlayer kurak = new BaseballPlayer("Kurak");
        Team<BaseballPlayer> differentBaseballPlayerTeam = new Team<>("Kury na grzędzie");

        differentBaseballPlayerTeam.addPlayer(kurak);

        LeagueTable<Team<BaseballPlayer>> baseballLeague = new LeagueTable<>("Puchar wielkiej pały");

        baseballLeague.add(baseballPlayerTeam);
        baseballLeague.add(differentBaseballPlayerTeam);

        baseballLeague.showLeagueTable();
    }
}
