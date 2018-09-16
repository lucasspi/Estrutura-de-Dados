package ca_arvore_buscaemlargura;
/**
 *
 * @author lucasspirandeli
 */
public class Ca_Arvore_BuscaEmLargura {



    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.insere(20);
        arvore.insere(2);
        arvore.insere(3);
        arvore.insere(4);
        arvore.insere(10);
        arvore.insere(15);
        arvore.insere(18);
        arvore.insere(14);

        System.out.print("(a) Caminho : ");
        arvore.Extensao();
        System.out.println("(b) Altura: " + arvore.altura());
        System.out.println("(c) Numero de nós: " + arvore.no());
        System.out.println("(d) Numero de folhas: " + arvore.folhas());

    }
}

