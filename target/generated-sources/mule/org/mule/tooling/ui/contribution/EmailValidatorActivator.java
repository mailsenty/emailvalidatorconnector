
package org.mule.tooling.ui.contribution;

import javax.annotation.Generated;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T12:32:02-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class EmailValidatorActivator
    extends AbstractUIPlugin
{

    public final static String PLUGIN_ID = "org.mule.tooling.ui.contribution.email-validator";
    private static org.mule.tooling.ui.contribution.EmailValidatorActivator plugin;

    public void start(BundleContext context)
        throws Exception
    {
        super.start(context);
        plugin = this;
    }

    public void stop(BundleContext context)
        throws Exception
    {
        plugin = null;
        super.stop(context);
    }

    public static org.mule.tooling.ui.contribution.EmailValidatorActivator getDefault() {
        return plugin;
    }

}
