import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 游戏主入口
 * 继承 Application 启动 JavaFX 程序
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // 创建根节点（布局容器）
        StackPane root = new StackPane();
        
        // 添加文本标签
        Label label = new Label("Luo Game 启动成功！");
        root.getChildren().add(label);
        
        // 创建场景（宽800，高600）
        Scene scene = new Scene(root, 800, 600);
        
        // 设置窗口标题并显示
        primaryStage.setTitle("Luo Game - v0.1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        // 启动 JavaFX 应用
        launch(args);
    }
}