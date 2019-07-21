package com.ajsherrell.hbotquiz.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ajsherrell.hbotquiz.R;
import com.ajsherrell.hbotquiz.model.CategoryContent;

import java.util.ArrayList;
import java.util.List;

public class QuizAdapter extends RecyclerView.Adapter<QuizAdapter.QuizViewHolder> {

    private static final String TAG = QuizAdapter.class.getSimpleName();
    private final Context mContext;
    private final QuizOnClickHandler mClickHandler;
    private List<CategoryContent> mCategoryList = new ArrayList<>();

    public interface QuizOnClickHandler {
        void onClick(CategoryContent clickedCategory);
    }

    public QuizAdapter(Context context, QuizOnClickHandler clickHandler, List<CategoryContent> categoryList) {
        mContext = context;
        mClickHandler = clickHandler;
        mCategoryList = categoryList;
    }

    class QuizViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView mImageView;

        public QuizViewHolder(View view) {
            super(view);
            mImageView = (ImageView) view.findViewById(R.id.photo_grid);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            mClickHandler.onClick(mCategoryList.get(adapterPosition));
            Log.d(TAG, "onClick is not working!!!" + adapterPosition);
        }

    }

    @NonNull
    @Override
    public QuizAdapter.QuizViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.categoryList;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new QuizViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizAdapter.QuizViewHolder quizViewHolder, int i) {
        CategoryContent categoryContent = mCategoryList.get(i);
        // TODO: get array of images and bind them to an ImageView.

    }

    @Override
    public int getItemCount() {
        return mCategoryList == null ? 0 : mCategoryList.size();
    }

    public void add(ArrayList<CategoryContent> data) {
        this.mCategoryList = data;
        notifyDataSetChanged();
    }

    public void clear() {
        mCategoryList.clear();
    }
}
