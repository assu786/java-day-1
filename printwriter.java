import java.io.PrintWriter;
class Sam
{
    public static void main(String args[])
    {
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("hii");
        pw.print("this is a");
        pw.print("printout statement");
        pw.close();
    }
}