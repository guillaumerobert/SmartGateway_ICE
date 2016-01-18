/*********************************************************************
	Rhapsody	: 8.1.3
	Login		: Guillaume Robert
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Facture
//!	Generated Date	: Mon, 11, Jan 2016 
	File Path	: DefaultComponent/DefaultConfig/Vue/Facture.java
*********************************************************************/

package Vue;

//## link itsControleurFournisseur 
import Controleur.ControleurFournisseur;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

//----------------------------------------------------------------------------
// Vue/Facture.java                                                                  
//----------------------------------------------------------------------------

//## package Vue 


//## class Facture 
public class Facture {
    
    protected ControleurFournisseur itsControleurFournisseur;		//## link itsControleurFournisseur 
	
    // Constructors
    
	/**
	 * @param totalTTCValeurString 
	 * @param coutUnitaireValeurString 
	 * @param releveTotalValeurString 
	 * @param releveHPValeurString 
	 * @param releveHCValeurString 
	 * @param compteurValeurString 
	 * @param mois **/
    
    String titre, nomCli, releveHCLabel, releveHPLabel, mois, conso, compteur, releveHC, releveHP, releveTotal, coutUnitaire, totalTTC, aReglerAvant;
    int numFact;
    BaseFont bfBold, bf;
    
	public Facture(String _mois, String nomComplet, String compteurValeurString, String releveHCValeurString, String releveHPValeurString, String releveTotalValeurString, String coutUnitaireValeurString, String totalTTCValeurString ){
		
		Random randomGenerator = new Random();
		numFact = randomGenerator.nextInt(100000);
		titre = "Votre facture n° " + Integer.toString(numFact);
		nomCli = nomComplet;
		mois = _mois;
		//conso = "Votre consommation du mois de " + mois;
		compteur = compteurValeurString;
		releveHCLabel = "Heures Creuses";
		releveHC = releveHCValeurString;
		releveHPLabel = "Heures Pleines";
		releveHP =  releveHPValeurString;
		
		releveTotal = "Total : " + releveTotalValeurString;
		coutUnitaire = "Cout unitaire TTC du kw/h : " + coutUnitaireValeurString;
		totalTTC = "Total TTC : " + totalTTCValeurString;
		aReglerAvant = "A régler avant le mois prochain";

	}
	
	public void genererFacture() {
		Document document = new Document(PageSize.A4, 50, 50, 50, 50);
		PdfWriter writer = null;
		
		try {
			writer = PdfWriter.getInstance(document, new FileOutputStream("Facture-"+numFact+".pdf"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		document.open();
		
		initializeFonts();
		
		Anchor anchorTarget = new Anchor(titre);
	      anchorTarget.setName("BackToTop");
	      Paragraph paragraph1 = new Paragraph();
	
	      paragraph1.setSpacingBefore(50);
	      
	      paragraph1.add(anchorTarget);
	      try {
			document.add(paragraph1);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			
			document.add(new Paragraph(releveTotal));
			document.add(new Paragraph(coutUnitaire));
			document.add(new Paragraph(totalTTC));
			document.add(new Paragraph(aReglerAvant));
			
			PdfContentByte cb = writer.getDirectContent();
			
			 cb.setLineWidth(1f);

		   // Invoice Header box layout
		   cb.rectangle(420,700,150,60);
		   cb.moveTo(420,720);
		   cb.lineTo(570,720);
		   cb.moveTo(420,740);
		   cb.lineTo(570,740);
		   cb.moveTo(480,700);
		   cb.lineTo(480,760);
		   cb.stroke();

		   // Invoice Header box Text Headings 
		   createHeadings(cb,422,743, "Compteur No.");
		   createHeadings(cb,422,723,"M. ou Mme");
		   createHeadings(cb,422,703, "Mois");
		   
		   createHeadings(cb,482,743, Integer.toString(numFact));
		   createHeadings(cb,482,723, nomCli);
		   createHeadings(cb,482,703, mois);

		   // Invoice Detail box layout 
		   cb.rectangle(20,50,550,600);
		   cb.moveTo(20,630);
		   cb.lineTo(570,630);
		   cb.moveTo(300,50);
		   cb.lineTo(300,650);
		   cb.stroke();
		   
		// Invoice Detail box Text Headings 
		   createHeadings(cb,22,633,"Consommation en");
		   createHeadings(cb,302,633,"Valeur");
		   
		   createContent(cb,102,618, releveHCLabel,PdfContentByte.ALIGN_RIGHT);
		   createContent(cb,302,618, releveHC,PdfContentByte.ALIGN_LEFT);
		   
		   createContent(cb,102,603, releveHPLabel,PdfContentByte.ALIGN_RIGHT);
		   createContent(cb,302,603, releveHP,PdfContentByte.ALIGN_LEFT);
			   
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		document.close();
	}
	
	 private void createHeadings(PdfContentByte cb, float x, float y, String text){

	  cb.beginText();
	  cb.setFontAndSize(bfBold, 8);
	  cb.setTextMatrix(x,y);
	  cb.showText(text.trim());
	  cb.endText(); 

	}
	 
	 private void createContent(PdfContentByte cb, float x, float y, String text, int align){


		  cb.beginText();
		  cb.setFontAndSize(bf, 8);
		  cb.showTextAligned(align, text.trim(), x , y, 0);
		  cb.endText(); 

	}
	 
	 private void initializeFonts(){


		  try {
		   bfBold = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
		   bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);

		  } catch (DocumentException e) {
		   e.printStackTrace();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }


		 }

    
    //## auto_generated 
    public ControleurFournisseur getItsControleurFournisseur() {
        return itsControleurFournisseur;
    }
    
    //## auto_generated 
    public void setItsControleurFournisseur(ControleurFournisseur p_ControleurFournisseur) {
        itsControleurFournisseur = p_ControleurFournisseur;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Vue/Facture.java
*********************************************************************/

