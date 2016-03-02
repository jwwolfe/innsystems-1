#Layout of networking communications

## Connection Flow ##

  * Host boots up and listens on TCP 7776 for Clients trying to find the Server
  * Client sends packet TCP 7776 on broadcast; Packet contains "IP:(ip address)"
  * Host splits up packet and stores Clients ip into an array of Clients.
    * Sends packet back containing; "IP:(server ip)"
    * Closes connection, listens for next Client

  * Client listens on 7777 for Variable packet to start test
  * Host gets ip from all Clients - wait for user start
  * Start pressed, Host listens on 7778 w/ queue = Clients for results
  * Host connects to one client at a time on TCP 7777 sends packet; "VAR:(LR):(HN):(IN)"
  * Client creates network with those variables and runs with the default data set
  * Client connects to Server on 7778 sends "RS:(error):(epochs)"; closes connection
  * Client listens on 7777 for Variable packet to start test