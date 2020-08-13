# iDAAS-Connect-HL7
iDAAS Connect Brand, specific connectivity is ONLY HL7 (any vendor and any version) - 
supported data is ADT, ORM, ORU, MFN, MDM, PHA, SCH and VXU

This repository follows a general implementation of a facility, we have named MCTN for
an application we have named MMS. This implementation specifically defines one HL7 
socket server endpoint per datatype mentioned above. 

## Implementation
Here are the implementation/data flow steps:

1. The HL7 client (external to this application) will connect to the specifically defined HL7
Server socket and typically stay connected.
2. The HL7 client will send a single HL7 based transaction to the HL7 server.
3. This Implemented application that acts as an HL7 Server will do the following actions:
    a. Receive the HL7 message. Internally, it will audit the data it received to 
    a specifically defined topic.<br/>
    b. The HL7 message will then be processed to a specifically defined topic for this implementation. <br/>
    c. An acknowledgement will then be sent back to the hl7 client (this tells the client he can send the next message,
    if the client does not get this in a timely manner it will resend the same message again until he receives an ACK).<br/>
    d. The acknowledgement is also sent to the auditing topic location.<br/>
    
## Guidance
Implementation Needs:
To simplify implementation needs the platform can be driven by configuration to help specifically define the following
attributes:
1.  HL7 Server ports - per each data type<br/>
2.  The server details of the Kafka connection: server name, and configuration details<br/>
3.  The specific topics for the implementation<br/>
