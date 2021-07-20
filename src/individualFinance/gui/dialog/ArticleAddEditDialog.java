package individualFinance.gui.dialog;

import individualFinance.exeption.ModelExeption;
import individualFinance.gui.MainFrame;
import individualFinance.model.Article;
import individualFinance.model.Common;
import individualFinance.settings.Style;

import javax.swing.*;

public class ArticleAddEditDialog extends AddEditDialog{

    public ArticleAddEditDialog(MainFrame frame) {
        super(frame);
    }

    @Override
    protected void init() {
        components.put("LABEL_TITLE", new JTextField());

        icons.put("LABEL_TITLE", Style.ICON_TITLE);
    }

    @Override
    protected void setValues() {
        Article article = (Article) c;
        values.put("LABEL_TITLE", article.getTitle());
    }

    @Override
    public Common getCommonFromForm() throws ModelExeption {
            String title = ((JTextField) components.get("LABEL_TITLE")).getText();
            return new Article(title);
    }
}
