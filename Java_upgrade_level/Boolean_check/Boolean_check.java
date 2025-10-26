class Method{
  int x, y;

  //Constructor(Ham khoi tao)
  Method(int x, int y){
    this.x = x;
    this.y = y;
  }

  public boolean compare1(){
    return x > y;
  }

  public boolean compare2(){
    return x == y;
  }

  public String if_else_statement(){
    if(x < 12){
      return "Good morning";
    }else if(x < 20){
      return "Good afternoon";
    }else{
      return "Good evening";
    }
  }

  //Toan tu ba ngoi (Conditional Operator)
  public String short_if_else_stt(){
    String message = if_else_statement();
    return message.equals("Good morning") ? "Have a nice day !" :
           message.equals("Good afternoon" ) ? "Enjoy your lunch !" : "Sleep well !";
  }
}

public class Boolean_check {
    public static void main(String[] args){
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    Method obj = new Method(10, 9);
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);
    System.out.println(obj.compare1());
    System.out.println(obj.compare2());
    String result = obj.if_else_statement();
    System.out.println(result);
    System.out.println(obj.short_if_else_stt());
  }
}
