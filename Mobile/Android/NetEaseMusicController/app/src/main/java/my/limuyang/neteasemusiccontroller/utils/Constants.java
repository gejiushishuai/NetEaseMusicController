package my.limuyang.neteasemusiccontroller.utils;

import android.support.annotation.StringDef;

import java.lang.annotation.Documented;

import static my.limuyang.neteasemusiccontroller.utils.Constants.ControlName.ADDVOL;
import static my.limuyang.neteasemusiccontroller.utils.Constants.ControlName.DECVOL;
import static my.limuyang.neteasemusiccontroller.utils.Constants.ControlName.LAST;
import static my.limuyang.neteasemusiccontroller.utils.Constants.ControlName.NEXT;
import static my.limuyang.neteasemusiccontroller.utils.Constants.ControlName.PAUSE_PLAY;

/**
 * Created by limuyang on 2017/6/20.
 */

public class Constants {
    public static String IpAddress = "192.168.191.1";
    public static int PORT = 8888;

    public static final String IP_ADDRESS = "ip_address";

    public static final String AUTO_SET_IP = "auto_set_ip";
    public static final String MANUAL_IP = "manual_ip";

    @StringDef({PAUSE_PLAY, LAST, NEXT, ADDVOL, DECVOL})
    @Documented
    public @interface ControlName {
        String PAUSE_PLAY = "PAUSE_PLAY";
        String LAST = "LAST";
        String NEXT = "NEXT";
        String ADDVOL = "ADDVOL";
        String DECVOL = "DECVOL";
    }
}
