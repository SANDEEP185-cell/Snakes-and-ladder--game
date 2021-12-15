class playerposition{
    private HashMap<String,Integer>hello=new HashMap<String,Integer>();
    void position(String name,int number){
        hello.put(name,number);
    }
    public HashMap getposition(){
        return hello;
    }
}
