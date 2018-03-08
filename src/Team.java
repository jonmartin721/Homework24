public class Team {

    private String teamName;
    private String name1, name2, name3, name4;
    private Competition competition1, competition2;

    public void displayInfo() {
        System.out.println("Team name: " + this.teamName);
        System.out.println("Team members:\n" + name1 + "\n" + name2 + "\n" + name3 + "\n" + name4);
        System.out.println("Competition info");
    }

}


