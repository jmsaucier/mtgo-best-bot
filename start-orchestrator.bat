java -Dhttps.protocols=TLSv1.1,TLSv1.2 -Dapp.home=C:\testing\mtgo-bot\ -Xdebug -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5007 -jar bot-orchestrator\target\bot-orchestrator-1.0.2-exec.jar