# iDAAS-Connect-HL7
iDAAS has several key components that provide many capabilities. iDAAS Connect is intended ONLY
to enable iDAAS connectivity. iDAAS-Connect-HL7 specifically ONLY deals with enabling 
iDAAS to process the healthcare industry standard HL7 based transactions ONLY.
It will process the following HL7 messages (ADT, ORM, ORU, MFN, MDM, PHA, SCH and VXU) 
from any vendor and any version.

## Scenario: Integration 
This repository follows a very common general facility based implementation. The implementation
is of a facility, we have named MCTN for an application we have named MMS. This implementation 
specifically defines one HL7 socket server endpoint per datatype mentioned above.

### Integration Data Flow Steps
 
1. The HL7 client (external to this application) will connect to the specifically defined HL7
Server socket (one socket per datatype) and typically stay connected.
2. The HL7 client will send a single HL7 based transaction to the HL7 server.
3. iDAAS Connect HL7 will do the following actions:<br/>
    a. Receive the HL7 message. Internally, it will audit the data it received to 
    a specifically defined topic.<br/>
    b. The HL7 message will then be processed to a specifically defined topic for this implementation. There is a 
    specific topic pattern -  for the facility and application each data type has a specific topic define for it.
    For example: MCTN_MMS_ADT, MCTN_MMS_ORM, etc. <br/>
    c. An acknowledgement will then be sent back to the hl7 client (this tells the client he can send the next message,
    if the client does not get this in a timely manner it will resend the same message again until he receives an ACK).<br/>
    d. The acknowledgement is also sent to the auditing topic location.<br/>
    
## Builds
This section will cover both local and automated builds.

### Local Builds
Within the code base you can find the local build commands in the /platform-scripts directory
1.  Run the build-solution.sh script
It will run the maven commands to build and then package up the solution. The package will use the usual settings
in the pom.xml file. It pulls the version and concatenates the version to the output jar it builds.
Additionally, there is a copy statement to remove any specific version, so it outputs idaas-connect-hl7.jar

### Automated Builds
Automated Builds are going to be done in Azure Pipelines

## Ongoing Enhancements
We maintain all enhancements within the Git Hub portal under the projects tab at 
https://github.com/RedHat-Healthcare/iDAAS-Connect-HL7/projects:

Configuration Enablement
https://github.com/RedHat-Healthcare/iDAAS-Connect-HL7/projects/1

## Defects/Bugs
All defects or bugs should be submitted through the Git Hub Portal under the issues tab at 
https://github.com/RedHat-Healthcare/iDAAS-Connect-HL7/issues

## Chat and Collaboration
You can always leverage Red Hat Healthcare's ZuilpChat area at https://redhathealthcare.zulipchat.com
and find all the specific areas for iDAAS-Connect-HL7. We look forward to any feedback!!

If you would like to contribute feel free to, contributions are always welcome!!!! 

Happy using and coding....

