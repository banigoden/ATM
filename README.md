atm definition - implement solutions for serv card clients with cards.
Namely:
check balance
print receipt
withdraw cash.

A client should be verified.
verification
blocked if 3 times wrong.

if a card is left in the card reader, the ATM will take it back in 1 minute.  

the solution will be deployed at ATMs such have different configurations.ATMs(hardware), that contain:
Devices:
monitor,
touchscreen,
card reader and etc.

ATM is able to communicate with GBIS by HTTP.


Use cases:
1Get Balance
1.1 Input card
1.2 verify card
1.3 Authentification
1.4  Show Menu
1.5 Choose get the balance item
1.6 inquiry balance from GBIS
1.7  show balance
1.8 back  
2Withdrow
2.1 Input...

3Print
3.1 input

Service
1ClientService(rename)
Session start(Card)
void stop(Session)
void reject(Session)
hadle(Command, Session)
2CardVerificationService
verify(Card)
3AuthentificationService
validate(Card, Key)

Menu 
MenuRander
rander()

AtmDispatcher
dispatch()
