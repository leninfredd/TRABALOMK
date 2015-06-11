package mortalkombat;

public class Xbox {

    public static void main(String[] args) {
        Reptile boneco1 = new Reptile();
        
        boneco1.setSocoforte(" Y ");
        boneco1.setSocofraco(" X ");
        boneco1.setChuteforte(" A ");
        boneco1.setChutefraco(" B ");
        boneco1.setDefesa("LT e RT");
        boneco1.setEspecial("LB eRB");
  
        System.out.println("---------------       XBOX    ----------------  ");
        System.out.println("\n------------Configurações de Botões Reptile -----------");
        System.out.println(" Soco Forte: " + boneco1.getSocoforte());
        System.out.println(" Soco Fraco: " + boneco1.getSocofraco());
        System.out.println(" Chute Forte: " + boneco1.getChuteforte() );
        System.out.println(" Chute Fraco: "  + boneco1.getChutefraco());
        System.out.println(" Defesa: " + boneco1.getDefesa());
        System.out.println(" Especial: " + boneco1.getEspecial() );
        System.out.println(" Todos os personagens começam com a vida em " + boneco1.getVida() + " % ");
        System.out.println("\n------------Comandos Especiais----------------");
        System.out.println("Invisivel: "  +  boneco1.invisivel());
        System.out.println("Ácido: " + boneco1.acido());
        System.out.println("Bola Rápida: " + boneco1.bolarapida());
        System.out.println("Bola Lenta: " + boneco1.bolalenta());
        System.out.println("Combo 1: " + boneco1.combo1());
        System.out.println("Combo 2: " + boneco1.combo2() );
        System.out.println("Fatalyty 1: " + boneco1.fatality());
        System.out.println("Fatality 2: " + boneco1.fatality1());
        
        Scorpion p1 = new Scorpion();
        
        p1.setSocoforte(" Y ");
        p1.setSocofraco(" X ");
        p1.setChuteforte(" A ");
        p1.setChutefraco(" B ");
        p1.setDefesa("LT e RT");
        p1.setEspecial("LB eRB");
        
         System.out.println("---------------       XBOX    ----------------  ");
        System.out.println("\n------------Configurações de Botões  -----------");
        System.out.println(" Soco Forte: " + p1.getSocoforte());
        System.out.println(" Soco Fraco: " + p1.getSocofraco());
        System.out.println(" Chute Forte: " + p1.getChuteforte() );
        System.out.println(" Chute Fraco: "  + p1.getChutefraco());
        System.out.println(" Defesa: " + p1.getDefesa());
        System.out.println(" Especial: " + p1.getEspecial() );
        System.out.println(" Todos os personagens começam com a vida em " + p1.getVida() + " % ");
        System.out.println("\n------------Comandos Especiais----------------");
        System.out.println("Invisivel: "  + p1.spear() );
        System.out.println("Ácido: " + p1.takedown() );
        System.out.println("Bola Rápida: " + p1.teleport());
        System.out.println("Combo 1: " + p1.combo1());
        System.out.println("Combo 2: " + p1.combo2());
        System.out.println("Fatalyty 1: " + p1.fatality());
        System.out.println("Fatality 2: " + p1.fatality1());
    
        
    
    }

}
