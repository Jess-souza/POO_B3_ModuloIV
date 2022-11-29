package exercicio;

import java.awt.*;

//public class Splash extends Window {
//    // Mensagem a ser mostrada junto com a imagem
//    private final String message = "Splash Screen";
//
//    // Imagem que ira aparecer no Splash
//    private final String imgName = "imagem.jpg";
//    Image splashImage;
//    Toolkit toolkit;
//    private static Splash splash;
//
//    public Splash() {
//        initSplash();
//    }
//
//    private void initSplash() {
//        // Carrega a imagem na memoria
//        MediaTracker media = new MediaTracker(this);
//        splashImage = toolkit.getImage(imgName);
//
//        if (splashImage != null) {
//            media.addImage(splashImage, 0);
//
//            try {
//                media.waitForID(0);
//            } catch (InterruptedException ie) {
//            }
//        }
//
//        // Configura o tamanho do splash e a posicao na tela
//        setSize(splashImage.getWidth(this), splashImage.getHeight(this));
//
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        Dimension size = getSize();
//
//        if (size.width > screenSize.width)
//            size.width = screenSize.width;
//
//        if (size.height > screenSize.height)
//            size.height = screenSize.height;
//
//        setLocation((screenSize.width - size.width) / 2, (screenSize.height - size.height) / 2);
//        setVisible(true);
//    }
//
//    @Override
//    public void paint(Graphics g) {
//        // Apenas desenha a nossa mensagem em cima da imagem
//        g.drawImage(splashImage, 0, 0, getBackground(), this);
//        g.setFont(new Font("Arial", Font.BOLD, 26));
//        g.drawString(message, (int) (splashImage.getWidth(this) / 2) - 80, 30);
//    }
//
//}

