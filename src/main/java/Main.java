
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;

public class Main {

    public static void main(String[] args)
    {
        NetworkTableInstance inst = NetworkTableInstance.getDefault();
        inst.startServer();

        NetworkTable table = inst.getTable("limelight");
        NetworkTableEntry tv = table.getEntry("tv");
        NetworkTableEntry tx = table.getEntry("tx");
        NetworkTableEntry ty = table.getEntry("ty");
        NetworkTableEntry ta = table.getEntry("ta");
        NetworkTableEntry ts = table.getEntry("ts");
        NetworkTableEntry tl = table.getEntry("tl");

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("interrupted");
                return;
            }

            tv.setDouble(1);
            tx.setDouble(2);
            ty.setDouble(3);
            ta.setDouble(5);
            tl.setDouble(7);
            ts.setDouble(9);
        }
    }
}
