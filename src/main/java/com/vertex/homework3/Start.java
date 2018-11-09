package com.vertex.homework3;

import com.vertex.homework3.homework4.LinkedContainer;
import com.vertex.homework3.homework4.ListenerCreatorLinkedContainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Start {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        final ArrayList<Ticket> ticketArrayList;
        TicketWindow ticketWindow = new TicketWindow();
        ticketArrayList = ticketWindow.ticketPrinting();

        final ArrayList<Lissiner> lissinerArrayList;
        ListenerCreator listenerCreator = new ListenerCreator();
        listenerCreator.createListNamesMan();
        listenerCreator.createListNamesWoman();
        lissinerArrayList = listenerCreator.createListOfListener();

        final ArrayList<Lissiner> listOfTicketsPurchased;
        Kassa kassa = new Kassa();
        listOfTicketsPurchased = kassa.formationlistOfTicketsPurchased(lissinerArrayList);
        final HashMap<Ticket, Lissiner> ticketLissinerMap;
        ticketLissinerMap = kassa.ticketSelling(listOfTicketsPurchased, ticketArrayList);
        kassa.showMap(ticketLissinerMap);

        PhilharmonicAdministration philharmonicAdministration = new PhilharmonicAdministration();
        philharmonicAdministration.searchForWinningTickets(ticketLissinerMap);
        philharmonicAdministration.broadcastAnnouncement(ticketLissinerMap);

        BonusKlass bonusKlass = new BonusKlass();
        final HashSet<Lissiner> hashSetlissinersWhoBoughtMoreThanOne;
        hashSetlissinersWhoBoughtMoreThanOne=bonusKlass.gettingAListForABonus(ticketLissinerMap);
        HackHashSet hackHashSet = new HackHashSet();
        hackHashSet.Hacking( hashSetlissinersWhoBoughtMoreThanOne);
        bonusKlass.announcementOfTheListAndBonus(hashSetlissinersWhoBoughtMoreThanOne);

        ListenerCreatorLinkedContainer listenerCreatorLinkedContainer= new ListenerCreatorLinkedContainer();
        LinkedContainer<Lissiner> lissinerLinkedContainer;
        lissinerLinkedContainer=listenerCreatorLinkedContainer.createListOfListenerInList(lissinerArrayList);
        listenerCreatorLinkedContainer.print( lissinerLinkedContainer);

    }
}
