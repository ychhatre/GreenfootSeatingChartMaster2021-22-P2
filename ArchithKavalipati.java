import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ArchithKavalipati here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArchithKavalipati extends Student implements CSALearnedSoFar
{


    /**
     * Act - do whatever the ArchithKavalipati wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public ArchithKavalipati(){
        firstName = "Archith";
        lastName = "Kavalipati";
        mySeatX=6;
        mySeatY=6;
        portraitFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
        soundFile=firstName.toLowerCase()+ lastName.toLowerCase()+".wav";
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        setImage(portraitFile);
        sitting=true;
    }
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }

    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("m")){
            //shuffleTableMethod();
        }
        
        if(Greenfoot.mouseClicked(this)){
          //  if (sitting){
                sitting=false;
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
                LearnedSoFar();
                returnHome(mySeatX,mySeatY);
                sitDown();
        }
    }
    public void LearnedSoFar(){
    }
    public void returnHome(int mySeatX,int mySeatY)
    /**
     * Local method to make the clicked move away from the mouse.
     */
    {
        int x = Greenfoot.getRandomNumber(14);
        int y = Greenfoot.getRandomNumber(14);
        Greenfoot.delay(6);
        setLocation(x,y);
        while (mySeatX != x && mySeatY != y){
            if(mySeatX>x){
                Greenfoot.delay(30);
                setLocation(x+1,y);
                x++;
            }
            if(mySeatX<x){
                Greenfoot.delay(30);
                setLocation(x-1,y);
                x--;
            }
            if(mySeatY >y){
                Greenfoot.delay(30);
                setLocation(x,y+1);
                y++;
            }
            if(mySeatY<y){
                Greenfoot.delay(30);
                setLocation(x,y-1);
                y--;
            }
        }
        
        
    }
    
}
