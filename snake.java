class Snake{
    private HashMap<Integer,Integer>a=new HashMap<Integer,Integer>();
    public void snakes(int start,int end){
        a.put(start,end);
    }
    public HashMap getsnakemap(){
        return a;
    }
}
