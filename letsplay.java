class letsplay{
    dice d=new dice();
    HashMap<Integer,Integer> snakes;
    HashMap<Integer,Integer> ladder;
    Queue<String>play;
    HashMap<String,Integer> position;
    int bsize;
    letsplay( HashMap<Integer,Integer> snakes,HashMap<Integer,Integer> ladder,Queue<String>play,HashMap<String,Integer> position,int bsize){
        this.snakes=snakes;
        this.ladder=ladder;
        this.play=play;
        this.position=position;
        this.bsize=bsize;
        
    }
    void winner(){
        while(true){
            String curpl=play.remove();
            play.add(curpl);
            int curpo=position.get(curpl);
            int value=d.rolldice();
            int np=curpo+value;
            if(np==bsize){
                System.out.println("I AM THE WINNER");
                break;
            }
            else if(np<bsize){
                if(snakes.containsKey(np)){
                    System.out.println("snake bite at"+np+"and moved to"+snakes.get(np));
                    position.put(curpl,snakes.get(np));
                }
                else if(ladder.containsKey(np)){
                     System.out.println("pick up the ladder"+np+"and moved to"+ladder.get(np));
                    position.put(curpl,ladder.get(np));
                }
                else{
                     System.out.println(curpo+"moved to"+np);;
                    position.put(curpl,np);
                }
                
            }
        
        }
    } 
}

