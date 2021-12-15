public class Solution {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int bsize=100;
        int ns=t.nextInt();
        t.nextLine();
        Snake r=new Snake();
        Ladder e=new Ladder();
        player k=new player();
        playerposition y=new playerposition();
        int i=0;
        while(i<ns){
            String b=t.nextLine();
            String[] a=b.split(" ");
            r.snakes(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
            i++;
        }
        int ld=t.nextInt();
        t.nextLine();
        int j=0;
        while(j<ld){
             String m=t.nextLine();
             String[] a=m.split(" ");
             e.ladders(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
             j++;
        }
        int n=t.nextInt();
        t.nextLine();
        int h=0;
        while(h<n){
        String x=t.nextLine();
        k.players(x);
        y.position(x,0);
        h++;
        }
        HashMap<Integer,Integer>p;
        p=r.getsnakemap();
        HashMap<Integer,Integer>q;
        q=e.getladdermap();
        Queue<String>d;
        d=k.getnames();
        HashMap<String,Integer>l;
        l=y.getposition();
        letsplay f=new letsplay(p,q,d,l,bsize);
        f.winner();
    }
}
