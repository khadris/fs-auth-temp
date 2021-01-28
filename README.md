# AUTH TEMP PROEJCT
It is a temporary project which gives the ejb project structure with the NSA framework.

### Modules
 It must have at least 4 modules
 - Ear
 -- Keep the environment specific artificates like app & server config files.
 -- After the build the ear will be placed in the target folder under this module
 - Model -> All the model classes should be added here
 - Service -> The business implementation should be provided here
 - Startup -> Registration for the exposed API services

### Server files
Along with the app config & server config files, the below files are expected in the server location
* ldap.conf
* pbe.conf
* trustedhosts.json
* trustedIdentities.json

Added these sample files in the ear module as a reference.

### Sample Request Details:
Once the ear is deployed on the server, invoke the request from the post man with the below details

Request Type: POST
URL: http://<HOST>:<PORT>/api/fs/temp/v1/myservice

Request Headers:
Content-Type:application/json
ClientName:test

Payload:
{
    "inputField" : "MY FIRST REQUEST"
}

