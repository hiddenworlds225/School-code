#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
#include <string.h>
#include <time.h>

/*
TODO:
If player is first, then they get the option to choose the attribute, then the npc chooses
After attribute is selected, the winner is declared
The winner is the player who has all the cards, any players with 0 cards will be eliminated.
*/
typedef struct CardStructure
{
    int Attack;
    int RangedAttack;
} Card;

//We can create a method to build the deck, then deal them to the player and bot
void generateDeck(Card *deck[]);
void dealCards(Card *playerCards[], Card *ComputerCards[], Card *Deck[]);
//checks who wins
int compareResults(int playerValue, int compValue);
//winner is given the other player's card, then all cards are moved forward. also checks if player has won the game too.
int checkWin(Card *playerCards[], Card *compCards[], int winner);
int checkDecks(Card * playerDeck[], Card * compDeck[]);

//used to handle the computer's moves based on its mode
int computerMove(Card *card, int mode);

int main(void)
{
    //inintialize decks/
    Card *deck[60];
    Card *playerDeck[60];
    Card *compDeck[60];

    srand(time(NULL));

    //holds name
    char name[50];

    //gets the mode for the computer
    int mode;

    //declares the winner of the game, is used to also break out of the first loop.
    int winner = 0;

    //print welcome and how-to
    printf("Welcome to warfare! In this game mode, each player will be given half a deck, the player that starts the round can choose the Attack and Ranged Attack attributes before going to war. When going to war, whoever has the stronger attribute will win the war! If it is a tie, then the cards are returned to the deck.\n");

    //get name
    printf("Please give a name, spaces are not allowed: ");
    scanf("%s", name);

    //add main loop here
    while (1)
    {
        /* code */

        //get cpu mode
        printf("Please select mode 1 for a predictable computer, or select mode 2 for a random computer, or mode 3 for a smart computer: ");
        scanf("%d", &mode);

        //makes sure the mode is valid
        while (mode < 1 || mode > 3)
        {
            printf("Mode choice is invalid, please choose 1, 2, or 3: ");
            scanf("%d", &mode);
        }

        printf("Welcome %s, generating deck and distributing cards...\n", name);
        //create a deck to use
        generateDeck(deck);
        //deal cards for the game
        dealCards(playerDeck, compDeck, deck);

        //vars to set the round player, the human goes first
        int currentPlayer = 0;
        while (winner == 0)
        {

            //display current card counts per deck
            int playerCardsCount = 0;
            for (int i = 0; i < 60; i++)
            {
                Card *card = playerDeck[i];
                if (card != NULL)
                {
                    playerCardsCount++;
                }
            }

            int compCardsCount = 0;
            for (int i = 0; i < 60; i++)
            {
                Card *card = compDeck[i];
                if (card != NULL)
                {
                    compCardsCount++;
                }
            }

            printf("\nName: %s\nCards in deck: %d\nComputer's cards: %d\n\n", name, playerCardsCount, compCardsCount);

            //used to get the rusult of the winner. Set to -1 if error occurs in results methods

            if (currentPlayer == 0)
            {
                //get top card and display it
                Card topCard = *playerDeck[0];
                printf("You go first! here's the top card in your deck:\nAttack: %d\nRanged Attack: %d\n",
                       topCard.Attack, topCard.RangedAttack);

                //get input from player and use it to make a move
                int action;
                printf("Please select attribute 1 (Attack) or 2 (Ranged Attack) to battle with: ");
                scanf("%d", &action);

                if (action == 1)
                {
                    printf("Player has chosen the Attack attribute! Go to war!\n");
                    int result = compareResults(playerDeck[0]->Attack, compDeck[0]->Attack);
                    checkWin(playerDeck, compDeck, result);
                }
                else
                {
                    printf("Player has chosen the Ranged Attack attribute! Go to war!\n");
                    int result = compareResults(playerDeck[0]->RangedAttack, compDeck[0]->RangedAttack);
                    checkWin(playerDeck, compDeck, result);
                }
            }
            else
            {
                printf("The computer goes first this round.\n");
                //computer makes a move
                int compMove = computerMove(deck[0], mode);
                if (compMove == 1)
                {
                    printf("Computer has chosen the Attack attribute! Go to war!\n");
                    int result = compareResults(playerDeck[0]->Attack, compDeck[0]->Attack);
                    checkWin(playerDeck, compDeck, result);
                }
                else if (compMove == 2)
                {
                    printf("Computer has chosen the Ranged Attack attribute! Go to war!\n");
                    int result = compareResults(playerDeck[0]->RangedAttack, compDeck[0]->RangedAttack);
                    checkWin(playerDeck, compDeck, result);
                }
            }

            winner = checkDecks(playerDeck, compDeck);

            currentPlayer = (currentPlayer == 0) ? 1 : 0;
        }

        //display who won the round
        if (winner == 1)
        {
            printf("Player wins the game!\n");
        }
        else if (winner == 2)
        {
            printf("Computer wins the game!\n");
        }
        else
        {
            printf("ERR: NUM IS %d\n", winner);
        }

        //ask if the player wants to play again. If not, end program
        char choice;
        printf("Would you like to play again? enter Y for yes, enter anything else to end game: ");
        scanf("%s", &choice);
        if (toupper(choice) != 'Y')
        {
            return 0;
        }
    }
    return 0;
}

//controls the computer
int computerMove(Card *card, int mode)
{

    switch (mode)
    {
        //returns the first attribute to play
    case 1:
        return 1;
        //returns one of the attibutes to play
    case 2:
        return (rand() % 2) + 1;
        //returns the highest attribute to play
    case 3:
        if(card->Attack == card->RangedAttack)
        {
            return rand() % 2 + 1;
        }

        if (card->Attack > card->RangedAttack)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }
}

//compares the cards
int compareResults(int playerValue, int compValue)
{
    printf("The player's strength is %d, the computer's is %d\n", playerValue, compValue);

    if (playerValue > compValue)
    {
        return 1;
    }
    else if (playerValue == compValue)
    {
        return 0;
    }
    else
    {
        return 2;
    }
}

//here, we deal the card to the players
void dealCards(Card *playerCards[], Card *ComputerCards[], Card *Deck[])
{

    //keeps track of the while loop, can also be used as the deck index
    int count = 0;

    //Handles how the deck is divided among the players before starting.
    //goes up by 1 when they recieve a card to help with the index.
    int playerDeckIndex = 0;
    int compDeckIndex = 0;

    //controls who gets the card
    int playerDealt = 0;

    while (count < 60)
    {

        //if the playerDealt is 0, then we give the card to the player and up his deck index
        if (playerDealt == 0)
        {
            playerCards[playerDeckIndex] = Deck[count];

            playerDeckIndex++;

            playerDealt = 1;
        }
        else //else, we give it to the computer
        {
            ComputerCards[compDeckIndex] = Deck[count];

            compDeckIndex++;

            playerDealt = 0;
        }

        count++;
    }

    for (int index = 30; index < 60; index++) // Set the non-existent cards to NULL
    {
        playerCards[index] = NULL;
        ComputerCards[index] = NULL;
    }
}

//generates the deck
void generateDeck(Card *Deck[])
{
    Card card;

    for (int i = 0; i < 60; i++)
    {
        //use the template to make the cards. Randomize attributes.
        card.Attack = rand() % 10;
        card.RangedAttack = rand() % 10;

        Deck[i] = (Card *)malloc(sizeof(Card));
        //Assign card to deck
        Deck[i]->Attack = card.Attack;
        Deck[i]->RangedAttack = card.RangedAttack;
    }
}

//gives the winner its cards and gives fixes the cards up. Also check how many cards are in each player's deck,
//and sees which one cannot play anymore.
int checkWin(Card *playerCards[], Card *compCards[], int winner)
{

    // use the winner variable to get the correct winner of the round

    //display who won the round
    if (winner == 1)
    {
        printf("Player wins the round!\n");
    }
    else if (winner == 2)
    {
        printf("Computer wins the round!\n");
    }
    else
    {
        printf("It was a tie!\n");
    }

    //use a case to see who won. if player 1 won, give them the cards, if bot won, give him the cards,
    //if a tie, move the top card to the bottom, then shift all cards to the left

    int playerCardMoved = 0;
    int compCardMoved = 0;

    switch (winner)
    {
        //A tie
    case 0:
        //its a tie, put top card at the bottom of the deck
        for (int i = 0; i < 60; i++)
        {
            if (playerCards[i] == NULL && playerCardMoved == 0)
            {
                playerCards[i] = playerCards[0];
                playerCardMoved++;
            }

            if (compCards[i] == NULL && compCardMoved == 0)
            {
                compCards[i] = compCards[0];
                compCardMoved++;
            }
        }
        break;
        //player wins
    case 1:
        for (int i = 0; i < 60; i++)
        {
            if (playerCards[i] == NULL)
            {
                playerCards[i] = compCards[0];
                playerCards[i + 1] = playerCards[0];

                break;
            }
        }
        break;
        //computer wins
    case 2:
        for (int i = 0; i < 60; i++)
        {
            if (compCards[i] == NULL)
            {
                compCards[i] = playerCards[0];
                compCards[i + 1] = compCards[0];
                break;
            }
        }
    }

    //shift all cards over
    for (int i = 1; i < 60; i++)
    {
        playerCards[i - 1] = playerCards[i];
        compCards[i - 1] = compCards[i];
    }
}
//check if deck is empty, returns winner;
int checkDecks(Card *playerDeck[], Card *compDeck[])
{
    int isEmpty = 1;
    //check if deck is empty
    for (int i = 0; i < 60; i++)
    {
        if (playerDeck[i] != NULL)
        {
            isEmpty = 0;
        }
    }

    if (isEmpty == 1)
    {
        return 2;
    }

    //do the same for the computer
    isEmpty = 1;
    for (int i = 0; i < 60; i++)
    {
        if (compDeck[i] != NULL)
        {
            isEmpty = 0;
        }
    }

    if (isEmpty == 1)
    {
        return 1;
    }

    return 0;
}