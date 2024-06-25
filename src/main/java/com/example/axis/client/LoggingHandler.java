package com.example.axis.client;

import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

public class LoggingHandler extends BasicHandler {
    @Override
    public void invoke(MessageContext msgContext) {
        try {
            // Log request message
            if (msgContext.getRequestMessage() != null) {
                String request = msgContext.getRequestMessage().getSOAPPartAsString();
                System.out.println("Request by handler: " + request);
            } else {
                System.out.println("Request by handler: MessageContext request message is null.");
            }

            // Invoke next handler in the chain
            // No need to call super.invoke(msgContext)

            // Log response message
            if (msgContext.getResponseMessage() != null) {
                String response = msgContext.getResponseMessage().getSOAPPartAsString();
                System.out.println("Response by handler: " + response);
            } else {
                System.out.println("Response by handler: MessageContext response message is null.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Exception in LoggingHandler: " + e.getMessage());
        }
    }
}
