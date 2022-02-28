package src;

class ResultMakerClass {
    int x=0,y=0,result=0;
    char oper=' ';
    public int ResultMaker(int x,int y, char oper){
        this.x=x;
        this.y=y;
        this.oper=oper;

        try {
            switch (oper) {
                case '+':
                    result = x + y;
                    break;
                case '-':
                    result = x - y;
                    break;
                case '*':
                    result = x * y;
                    break;
                case '/':
                    if (y == 0) {
                        result = 0;
                    } else
                        result = x / y;
                    break;
            }
        }catch (ArithmeticException e) {
            e.fillInStackTrace();
        }
        return result;
    }
}