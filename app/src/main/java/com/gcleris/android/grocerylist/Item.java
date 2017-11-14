package com.gcleris.android.grocerylist;

/**
 * Created by Ghislain on 2016-09-08.
 * Classe contenant les composantes d'un item sur la liste d'épicerie.
 */
public class Item {

    // id = Identificateur unique de l'item fourni automatiquement par la base de données SQL.
    // position = Position dans l'épicerie de 1 à 5 (1 = au début, 3 = au milieu, 5 = à la fin).
    // qty = La quantité d'items à acheter
    // itemName = Nom descriptif de l'item.
    // itemToBuy = Niveau de l'inventaire dans le garde manger, item à acheter
    // itemBought = Enregistre les items qui ont été achetés lors de l'épicerie (si coché veut dire que l'article a été acheté et que l'inventaire est maintenant revenu à haut)
    // essentiel = Article essentiel à avoir dans la cuisine en tout temps, à vérifier à chaque épicerie.

    public int id, position, qty;
    public String itemName;
    public Boolean itemBought, itemToBuy, essentiel;


    public Item(int id, int position, int qty, String itemName, Boolean itemBought, Boolean itemToBuy, Boolean essentiel) {
        this.id = id;
        this.position = position;
        this.qty = qty;
        this.itemName = itemName;
        this.itemBought = itemBought;
        this.essentiel = essentiel;
        this.itemToBuy = itemToBuy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getPosition(){
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getQty() { return qty; }

    public void setQty(int qty) { this.qty = qty; }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemNom) {
        this.itemName = itemNom;
    }

    public Boolean getNivInventaire() {
        return itemBought;
    }

    public void setItemToBuy(Boolean itemToBuy) {
        this.itemToBuy = itemToBuy;
    }

    public Boolean getItemToBuy() {
        return itemToBuy;
    }

    public void setNivInventaire(Boolean nivInventaire) {
        this.itemBought = nivInventaire;
    }

    public Boolean getEssentiel() {
        return essentiel;
    }

    public void setEssentiel(Boolean essentiel) {
        this.essentiel = essentiel;
    }
}