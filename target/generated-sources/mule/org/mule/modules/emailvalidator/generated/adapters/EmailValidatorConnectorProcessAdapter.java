
package org.mule.modules.emailvalidator.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.emailvalidator.EmailValidatorConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>EmailValidatorConnectorProcessAdapter</code> is a wrapper around {@link EmailValidatorConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-07-20T12:32:02-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class EmailValidatorConnectorProcessAdapter
    extends EmailValidatorConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<EmailValidatorConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, EmailValidatorConnectorCapabilitiesAdapter> getProcessTemplate() {
        final EmailValidatorConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,EmailValidatorConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, EmailValidatorConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, EmailValidatorConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
