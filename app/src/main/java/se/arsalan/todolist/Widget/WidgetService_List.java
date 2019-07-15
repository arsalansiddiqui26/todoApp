package se.arsalan.todolist.Widget;

import android.content.Intent;
import android.widget.RemoteViewsService;

public class WidgetService_List extends RemoteViewsService {
    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return (new ViewFactory_List(this.getApplicationContext(), intent));
    }
}
