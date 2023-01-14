package Decorator;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Send week report to client.";
    }

    @Override
    public String doJob(){
        return sendWeekReport() + developer.doJob();
    }

}
