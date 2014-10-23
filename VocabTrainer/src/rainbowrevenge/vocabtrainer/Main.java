package rainbowrevenge.vocabtrainer;



import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.ListView;
import android.widget.AdapterView;
import android.util.Log;

abstract class Main
extends Activity
implements OnClickListener, OnKeyListener
{
    protected static final int KEY_GRADE0 = 0;
    protected static final int KEY_GRADE1 = 1;
    protected static final int KEY_GRADE2 = 2;
    protected static final int KEY_GRADE3 = 3;
    protected static final int KEY_GRADE4 = 4;
    protected static final int KEY_GRADE5 = 5;
    protected static final int KEY_SHOW_ANSWER = 6;
    
    
    
    
    
    
    
    
    
    WebView webview;
    
    
    int[] grading_buttons = {R.id.grade0, R.id.grade1, R.id.grade2,
                             R.id.grade3, R.id.grade4, R.id.grade5};
    int[] show_button = {R.id.show};
    
    public void onCreate(Bundle savedInstanceState){
    	super.onCreate(savedInstanceState);
    	setFullscreenMode();
    	setContentView(R.layout.main);
    	webview = (WebView) findViewById(R.id.card_webview);
    	webview.setOnKeyListener(this);
    }
    
    
    
    public void setFullscreenMode()
    {
    	SharedPreferences settings = PreferenceManager
    			.getDefaultSharedPreferences(this);
    	if (settings.getBoolean("fullscreen_mode", false)) {
    		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
    		WindowManager.LayoutParams.FLAG_FULLSCREEN);
    	}
    }
    
    
}
