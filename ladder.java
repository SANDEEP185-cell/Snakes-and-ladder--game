class Ladder{
    private HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
    public void ladders(int start,int end){
        a.put(start,end);
    }
    public HashMap getladdermap(){
        return a;
    }
}
