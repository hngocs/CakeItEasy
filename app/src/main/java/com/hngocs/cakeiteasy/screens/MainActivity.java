package com.hngocs.cakeiteasy.screens; // Giữ nguyên package của bạn

import android.os.Bundle;

import com.hngocs.cakeiteasy.R;

// Sửa từ "extends AppCompatActivity" thành "extends BaseActivity"
public class MainActivity extends BaseActivity {

    // Đây là phương thức trừu tượng từ BaseActivity, bắt buộc phải có
    @Override
    public int getNavItemIndex() {
        // Trả về 0 vì đây là item "Home" (màn hình chính, item đầu tiên)
        return 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // super.onCreate() sẽ tự động gọi setContentView(R.layout.activity_base)
        // và thiết lập thanh điều hướng, nên chúng ta gọi nó đầu tiên.
        super.onCreate(savedInstanceState);

        // Bây giờ, "nhét" layout của màn hình Main/Home vào khung trống của BaseActivity
        setContentLayout(R.layout.activity_main);

        // Từ đây, bạn có thể viết code logic riêng cho màn hình này
        // Ví dụ: tìm các view trong R.layout.activity_main
        // TextView myText = findViewById(R.id.my_home_text);
        // myText.setText("Hello from Home!");
    }
}