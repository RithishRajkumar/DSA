public class practise {
    protected int[]data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public practise(){
        this(DEFAULT_SIZE);
    }
    public practise(int value){
        this.value=new int[value];
    }
    publid boolean push(int item){
        if isFull(){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]==item;
        return true;
        
        

    }
    public int pop(){
        
    }
    public boolean isFull(){
        return ptr=data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }


}
