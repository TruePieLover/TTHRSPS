/*************************************
 *     TTHRSPS V1.0
 * @author Pie
 * @package com.tth.rsps.client
 * @copyright: TTH2020
 * @version TTH Development Build 1.0
 * @date 9/25/2020
 * @description RTClient RSPS package
 ************************************/
package com.tth.rspscore;
import com.tth.rspscore.client.*;
import javax.swing.SwingUtilities;

/* RTMain.java:
    Main TTHRSPS App src class */
import javax.swing.SwingUtilities;

public class RTMain {
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RTLauncher(args).InitDefLauncher();
            }
        });
    }
}
