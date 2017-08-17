package cn.colintree.aix.ColinTreeSysLang;

import android.content.*;
import android.util.*;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;

import java.util.Locale;

@DesignerComponent(version = ColinTreeSysLang.VERSION,
    description = "by ColinTree at http://aix.colintree.cn",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "images/extension.png")

@SimpleObject(external = true)

public class ColinTreeSysLang extends AndroidNonvisibleComponent
implements Component {
    public static final int VERSION = 1;
    private ComponentContainer container;
    private Context context;
    private static final String LOG_TAG = "ColinTreeSysLang";
    public ColinTreeSysLang(ComponentContainer container) {
        super(container.$form());
        this.container = container;
        context = (Context) container.$context();
        Log.d(LOG_TAG, "ColinTreeSysLang Created" );
    }
    
    @SimpleFunction(description = "Get System default language")
    public String SysLang() {
    	Locale locale = context.getResources().getConfiguration().locale;
    	String language = locale.getLanguage();
    	return language;
    }
    @SimpleFunction(description = "Return if system default language is chinese")
    public boolean SysLangIsZh() {
    	return (SysLang().endsWith("zh"));
    }
    @SimpleFunction(description = "Return if system default language is english")
    public boolean SysLangIsEn() {
    	return (SysLang().endsWith("en"));
    }
}