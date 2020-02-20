package jobsheetTugas;
public class PacMan_1941720021 {
        static int x ;
	static int y;
	static int width;
	static int height;
	
        public PacMan_1941720021(int hor,int ver,int lebar, int panjang){
            x=hor;
            y=ver;
            width=lebar;
            height=panjang;
        }
        void moveLeft(){
            if(x>0 || x>width){
                x=x-1;
            }
        }
        void moveRight(){
            if(x>0 || x>width){
                x=x-1;
            }
        }
        void moveUp(){
            if(y>0 || y>height){
                y=y-1;
            }
        }
        void moveDown(){
            if(y>0 || y>height){
                y=y+1;
            }
        }
        void printPosition(){
           for(int i=0; i<height;i++){
               for(int j=0; j<width; j++){
                   if(y==i && x==j){
                       System.out.print("*");
                   }
                   else{
                       System.out.print(" ");
                   }
               }
               System.out.println();
           }
        }
   public static void main(String[]args){
     PacMan_1941720021 a=new PacMan_1941720021 (8,9,10,15);
     a.printPosition();
   }
}