class player{
    Queue<String>play=new LinkedList<>();
    public void players(String name){
        play.add(name);
    }
    public Queue getnames(){
        return play;
    }
}
