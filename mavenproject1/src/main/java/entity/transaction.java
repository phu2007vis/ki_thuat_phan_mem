
package entity;

public class transaction {
    private int id;
    private int money;
    private String timeDisplay;
    private String content;
    private int memberId;

    // Constructor
    public transaction(int id, int money,  String timeDisplay, String content,
                       int memberId) {
       
        if(id<=0){
            
            throw new RuntimeException("Invalid id: Value must be non-negative.");
            
        }
        if(money<=0){
            
            throw new RuntimeException("Invalid money: Value must be non-negative.");
            
        }
        if(memberId<=0){
            
            throw new RuntimeException("Invalid member id: Value must be non-negative.");
            
        }
        if(content.length()<=0){
            
            throw new RuntimeException("Content null");
            
        }
        
        this.id = id;
        this.money = money;
        this.timeDisplay = timeDisplay;
        this.content = content;
        this.memberId = memberId;
    }

    public int getId() {
        return id;
    }

    public int getMoney() {
        return money;
    }

    public String getTimeDisplay() {
        return timeDisplay;
    }

    public String getContent() {
        return content;
    }

    public int getMemberId() {
        return memberId;
    }
    
    
}