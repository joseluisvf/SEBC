# Security Lab
## Integrating Kerberos with Cloudera Manager


 1. The kinit command you use to authenticate your test user

    ```
    $ kadmin -p jose
    Authenticating as principal jose with password.
    Password for jose@JOSELUISVF.COM:
    kadmin:  addprinc joseluisvf
    WARNING: no policy specified for joseluisvf@JOSELUISVF.COM; defaulting to no policy
    Enter password for principal "joseluisvf@JOSELUISVF.COM":
    Re-enter password for principal "joseluisvf@JOSELUISVF.COM":
    Principal "joseluisvf@JOSELUISVF.COM" created.
    kadmin:  exit
    $ kinit joseluisvf
    Password for joseluisvf@JOSELUISVF.COM:
    $
    ```

 1. The output from a klist command listing your credentials and ticket lifetime

    ```
    $ Ticket cache: FILE:/tmp/krb5cc_0
    Default principal: joseluisvf@JOSELUISVF.COM

    Valid starting     Expires            Service principal
    03/09/17 08:55:52  03/10/17 08:55:52  krbtgt/JOSELUISVF.COM@JOSELUISVF.COM
	renew until 03/16/17 08:55:52
    $
    ```
