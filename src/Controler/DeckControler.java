/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.*;

/**
 *
 * @author Roman
 */
public class DeckControler {

   private DeckModel _model;

   public DeckControler ( DeckModel _model ) {
      this._model = _model;
   }

   public void give ( CardModel card, DeckModel deck ) {
      _model.giveCard(card, deck);
   }
}
