package com.friends.android;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.friends.android.result.ChatResult;
import com.friends.android.result.DiaryResult;
import com.friends.android.result.FriendInfoResult;
import com.friends.android.result.FriendsBirthdayResult;
import com.friends.android.result.FriendsResult;
import com.friends.android.result.GiftResult;
import com.friends.android.result.HomeResult;
import com.friends.android.result.LocationResult;
import com.friends.android.result.NearbyPeopleResult;
import com.friends.android.result.NearbyPhotoResult;
import com.friends.android.result.PhotoResult;
import com.friends.android.result.PublicPageResult;
import com.friends.android.result.RecommendResult;
import com.friends.android.result.StatusResult;
import com.friends.android.result.ViewedResult;
import com.friends.android.result.VisitorsResult;
import com.friends.android.utils.PhotoUtil;

/**
 * ��Ź��е�����
 * 
 * @author wangxinwen
 * 
 */
public class FriendsApplication extends Application {

	/**
	 * Ĭ�ϱ�ֽ
	 */
	public Bitmap mDefault_Wallpager;
	/**
	 * Ĭ�ϱ����ֽ
	 */
	public Bitmap mDefault_TitleWallpager;
	/**
	 * Ĭ��ͷ��
	 */
	public Bitmap mDefault_Avatar;
	/**
	 * Ĭ����Ƭ
	 */
	public Bitmap mDefault_Photo;
	/**
	 * ��ֽ����
	 */
	public HashMap<String, SoftReference<Bitmap>> mWallpagersCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * ��ֽ����
	 */
	public String[] mWallpagersName;
	/**
	 * �����ֽ����
	 */
	public HashMap<String, SoftReference<Bitmap>> mTitleWallpagersCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * �����ֽ����
	 */
	public String[] mTitleWallpagersName;
	/**
	 * ��ǰ��ֽ���
	 */
	public int mWallpagerPosition = 0;
	/**
	 * Բ��ͷ�񻺴�
	 */
	public HashMap<String, SoftReference<Bitmap>> mAvatarCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * Ĭ��ͷ�񻺴�
	 */
	public HashMap<String, SoftReference<Bitmap>> mDefaultAvatarCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * ͷ������
	 */
	public String[] mAvatars;
	/**
	 * ������ҳͷ�񻺴�
	 */
	public HashMap<String, SoftReference<Bitmap>> mPublicPageAvatarCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * ������ҳͷ������
	 */
	public String[] mPublicPageAvatars;
	/**
	 * ����
	 */
	public int[] mFaces = { R.drawable.face_0, R.drawable.face_1,
			R.drawable.face_2, R.drawable.face_3, R.drawable.face_4,
			R.drawable.face_5, R.drawable.face_6, R.drawable.face_7,
			R.drawable.face_8, R.drawable.face_9, R.drawable.face_10,
			R.drawable.face_11, R.drawable.face_12, R.drawable.face_13,
			R.drawable.face_14, R.drawable.face_15, R.drawable.face_16,
			R.drawable.face_17, R.drawable.face_18, R.drawable.face_19,
			R.drawable.face_20, R.drawable.face_21, R.drawable.face_22,
			R.drawable.face_23, R.drawable.face_24, R.drawable.face_25,
			R.drawable.face_26, R.drawable.face_27, R.drawable.face_28,
			R.drawable.face_29, R.drawable.face_30, R.drawable.face_31,
			R.drawable.face_32, R.drawable.face_33, R.drawable.face_34,
			R.drawable.face_35, R.drawable.face_36, R.drawable.face_37,
			R.drawable.face_38, R.drawable.face_39, R.drawable.face_40,
			R.drawable.face_41, R.drawable.face_42, R.drawable.face_43,
			R.drawable.face_44, R.drawable.face_45, R.drawable.face_46,
			R.drawable.face_47, R.drawable.face_48, R.drawable.face_49,
			R.drawable.face_50, R.drawable.face_51, R.drawable.face_52,
			R.drawable.face_53, R.drawable.face_54, R.drawable.face_55,
			R.drawable.face_56, R.drawable.face_57, R.drawable.face_58,
			R.drawable.face_59, R.drawable.face_60, R.drawable.face_61,
			R.drawable.face_62, R.drawable.face_63, R.drawable.face_64,
			R.drawable.face_65, R.drawable.face_66, R.drawable.face_67,
			R.drawable.face_68, R.drawable.face_69, R.drawable.face_70,
			R.drawable.face_71, R.drawable.face_72, R.drawable.face_73,
			R.drawable.face_74, R.drawable.face_75, R.drawable.face_76,
			R.drawable.face_77, R.drawable.face_78, R.drawable.face_79,
			R.drawable.face_80, R.drawable.face_81, R.drawable.face_82,
			R.drawable.face_83, R.drawable.face_84, R.drawable.face_85,
			R.drawable.face_86, R.drawable.face_87, R.drawable.face_88,
			R.drawable.face_89, R.drawable.face_90, R.drawable.face_91,
			R.drawable.face_92, R.drawable.face_93, R.drawable.face_94,
			R.drawable.face_95, R.drawable.face_96, R.drawable.face_97,
			R.drawable.face_98, R.drawable.face_99, R.drawable.face_100,
			R.drawable.face_101, R.drawable.face_102, R.drawable.face_103,
			R.drawable.face_104, R.drawable.face_105, R.drawable.face_106,
			R.drawable.face_107, R.drawable.face_108, R.drawable.face_109,
			R.drawable.face_110 };
	/**
	 * ��������
	 */
	public List<String> mFacesText = new ArrayList<String>();
	/**
	 * ���黺��
	 */
	public HashMap<String, SoftReference<Bitmap>> mFaceCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * ��Ƭ����
	 */
	public HashMap<String, SoftReference<Bitmap>> mPhotoCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * ��Ƭ����
	 */
	public String[] mPhotosName;
	/**
	 * ת��ͼƬ����
	 */
	public HashMap<String, SoftReference<Bitmap>> mViewedCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * ת��ͼƬ����
	 */
	public String[] mViewedName;
	/**
	 * ����ת��ͼƬ����
	 */
	public HashMap<String, SoftReference<Bitmap>> mViewedHotCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * ����ת��ͼƬ����
	 */
	public String[] mViewedHotName;
	/**
	 * ��ϷͼƬ����
	 */
	public HashMap<String, SoftReference<Bitmap>> mRecommendCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * ������Ƭ����
	 */
	public HashMap<String, SoftReference<Bitmap>> mNearbyPhoto = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * ��ҳͼƬ����
	 */
	public HashMap<String, SoftReference<Bitmap>> mHomeCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * �ֻ�SD��ͼƬ����
	 */
	public HashMap<String, SoftReference<Bitmap>> mPhoneAlbumCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * �ֻ�SD��ͼƬ��·��
	 */
	public Map<String, List<Map<String, String>>> mPhoneAlbum = new HashMap<String, List<Map<String, String>>>();

	/**
	 * �����û���ҳ����
	 */
	public List<HomeResult> mMyHomeResults = new ArrayList<HomeResult>();
	/**
	 * ��ǰ�û�����������
	 */
	public FriendInfoResult mMyInfoResult;

	/**
	 * ��ǰ�û�����������
	 */
	public List<VisitorsResult> mMyVisitorsResults = new ArrayList<VisitorsResult>();
	/**
	 * ��ǰ�û���״̬����
	 */
	public List<StatusResult> mMyStatusResults = new ArrayList<StatusResult>();
	/**
	 * ��ǰ�û����������
	 */
	public List<PhotoResult> mMyPhotoResults = new ArrayList<PhotoResult>();
	/**
	 * ��ǰ�û����ռ�����
	 */
	public List<DiaryResult> mMyDiaryResults = new ArrayList<DiaryResult>();
	/**
	 * ��ǰ�û��ĺ�������
	 */
	public List<FriendsResult> mMyFriendsResults = new ArrayList<FriendsResult>();
	/**
	 * ��ǰ�û��ĺ��Ѹ�����������ĸ����
	 */
	public Map<String, List<FriendsResult>> mMyFriendsGroupByFirstName = new HashMap<String, List<FriendsResult>>();
	/**
	 * ��ǰ�û��ĺ��ѵ���������ĸ���б��е�λ��
	 */
	public Map<String, Integer> mMyFriendsFirstNamePosition = new HashMap<String, Integer>();
	/**
	 * ��ǰ�û��ĺ��ѵ�����������ĸ����
	 */
	public List<String> mMyFriendsFirstName = new ArrayList<String>();
	/**
	 * ��ǰ�û��ĺ��ѵ�����������ĸ�����б��е�λ��
	 */
	public List<Integer> mMyFriendsPosition = new ArrayList<Integer>();

	/**
	 * ��ǰ�û��Ĺ�����ҳ����
	 */
	public List<PublicPageResult> mMyPublicPageResults = new ArrayList<PublicPageResult>();
	/**
	 * ��ǰ�û��Ĺ�����ҳ������������ĸ����
	 */
	public Map<String, List<PublicPageResult>> mMyPublicPageGroupByFirstName = new HashMap<String, List<PublicPageResult>>();

	/**
	 * ��ǰ�û��ĺ���ת������
	 */
	public List<ViewedResult> mMyViewedResults = new ArrayList<ViewedResult>();

	/**
	 * ��ǰ�û�������ת������
	 */
	public List<ViewedResult> mViewedHotResults = new ArrayList<ViewedResult>();

	/**
	 * ��ǰ�û�����������պ�������
	 */
	public List<FriendsBirthdayResult> mMyFriendsBirthdayResults = new ArrayList<FriendsBirthdayResult>();

	/**
	 * ��ǰ�û����Ƽ��ٷ�ģ������
	 */
	public List<RecommendResult> mMyRecommendOfficialResults = new ArrayList<RecommendResult>();
	/**
	 * ��ǰ�û����Ƽ�Ӧ����������
	 */
	public List<RecommendResult> mMyRecommendAppDownLoadResults = new ArrayList<RecommendResult>();

	/**
	 * ��ǰ�û��ĸ�����������
	 */
	public List<NearbyPeopleResult> mMyNearByPeopleResults = new ArrayList<NearbyPeopleResult>();

	/**
	 * ��ǰ�û��ĸ�������Ƭ����
	 */
	public List<NearbyPhotoResult> mMyNearbyPhotoResults = new ArrayList<NearbyPhotoResult>();

	/**
	 * ��ǰ�û��ĵ���λ������
	 */
	public List<LocationResult> mMyLocationResults = new ArrayList<LocationResult>();

	/**
	 * ���к��ѵ��������� (Key��Ӧ�ú��ѵ�uid)
	 */
	public Map<String, FriendInfoResult> mFriendInfoResults = new HashMap<String, FriendInfoResult>();

	/**
	 * ���к��ѵ��������� (Key��Ӧ�ú��ѵ�uid)
	 */
	public Map<String, List<VisitorsResult>> mFriendVisitorsResults = new HashMap<String, List<VisitorsResult>>();

	/**
	 * ���к��ѵ�״̬���� (Key��Ӧ�ú��ѵ�uid)
	 */
	public Map<String, List<StatusResult>> mFriendStatusResults = new HashMap<String, List<StatusResult>>();

	/**
	 * ���к��ѵ�������� (Key��Ӧ�ú��ѵ�uid)
	 */
	public Map<String, List<PhotoResult>> mFriendPhotoResults = new HashMap<String, List<PhotoResult>>();

	/**
	 * ���к��ѵ��ռ����� (Key��Ӧ�ú��ѵ�uid)
	 */
	public Map<String, List<DiaryResult>> mFriendDiaryResults = new HashMap<String, List<DiaryResult>>();

	/**
	 * ���к��ѵĺ������� (Key��Ӧ�ú��ѵ�uid)
	 */
	public Map<String, List<FriendsResult>> mFriendFriendsResults = new HashMap<String, List<FriendsResult>>();

	/**
	 * ��������¼
	 */
	public List<ChatResult> mChatResults = new ArrayList<ChatResult>();

	/**
	 * �����������ĺ���
	 */
	public Map<String, Map<String, String>> mGiftFriendsList = new HashMap<String, Map<String, String>>();

	/**
	 * �������ͼƬ
	 */
	public HashMap<String, SoftReference<Bitmap>> mGiftsCache = new HashMap<String, SoftReference<Bitmap>>();

	public String[] mGiftsName;
	/**
	 * �������ľ�����Ϣ
	 */
	public List<GiftResult> mGiftResults = new ArrayList<GiftResult>();

	/**
	 * ��Ŵ�Ϊ�ݸ���ռǱ���
	 */
	public String mDraft_DiaryTitle;
	/**
	 * ��Ŵ�Ϊ�ݸ���ռ�����
	 */
	public String mDraft_DiaryContent;

	/**
	 * ��������ϴ�����Ƭ·��
	 */
	public String mUploadPhotoPath;
	/**
	 * ��ű���ѡȡ����Ƭ����
	 */
	public List<Map<String, String>> mAlbumList = new ArrayList<Map<String, String>>();

	public void onCreate() {
		super.onCreate();
		/**
		 * ��ʼ��Ĭ������
		 */
		mDefault_Wallpager = BitmapFactory.decodeResource(getResources(),
				R.drawable.cover);
		mDefault_TitleWallpager = BitmapFactory.decodeResource(getResources(),
				R.drawable.cover_title);
		mDefault_Photo = BitmapFactory.decodeResource(getResources(),
				R.drawable.photo);
		mDefault_Avatar = PhotoUtil.toRoundCorner(
				BitmapFactory.decodeResource(getResources(), R.drawable.head),
				15);
		mWallpagerPosition = (int) (Math.random() * 12);
		/**
		 * ��ʼ�����е�������Ϣ
		 */
		try {
			mWallpagersName = getAssets().list("wallpaper");
			mTitleWallpagersName = getAssets().list("title_wallpager");
			mAvatars = getAssets().list("avatar");
			mPublicPageAvatars = getAssets().list("publicpage_avatar");
			mPhotosName = getAssets().list("photo");
			mViewedName = getAssets().list("viewed");
			mViewedHotName = getAssets().list("viewed_hot");
			mGiftsName = getAssets().list("gifts");
		} catch (IOException e) {
			e.printStackTrace();
		}
		/**
		 * ��ʼ����������
		 */
		for (int i = 0; i < mFaces.length; i++) {
			mFacesText.add("[face_" + i + "]");
		}
	}

	/**
	 * ���ݱ�ֽ��Ż�ȡ��ֽ
	 */
	public Bitmap getWallpager(int position) {
		try {
			String wallpagerName = mWallpagersName[position];
			Bitmap bitmap = null;
			if (mWallpagersCache.containsKey(wallpagerName)) {
				SoftReference<Bitmap> reference = mWallpagersCache
						.get(wallpagerName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"wallpaper/" + wallpagerName));
			mWallpagersCache.put(wallpagerName, new SoftReference<Bitmap>(
					bitmap));
			return bitmap;

		} catch (Exception e) {
			return mDefault_Wallpager;
		}
	}

	/**
	 * ���ݱ�ֽ��Ż�ȡ�����ֽ
	 */
	public Bitmap getTitleWallpager(int position) {
		try {
			String titleWallpagerName = mTitleWallpagersName[position];
			Bitmap bitmap = null;
			if (mTitleWallpagersCache.containsKey(titleWallpagerName)) {
				SoftReference<Bitmap> reference = mTitleWallpagersCache
						.get(titleWallpagerName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"title_wallpager/" + titleWallpagerName));
			mTitleWallpagersCache.put(titleWallpagerName,
					new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return mDefault_TitleWallpager;
		}
	}

	/**
	 * ����ͼƬ���ƻ�ȡ��ҳͼƬ
	 */
	public Bitmap getHome(String photo) {
		try {
			String homeName = photo + ".jpg";
			Bitmap bitmap = null;
			if (mHomeCache.containsKey(homeName)) {
				SoftReference<Bitmap> reference = mHomeCache.get(homeName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"home/" + homeName));
			mHomeCache.put(homeName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.picture_default_fg);
		}
	}

	/**
	 * ���ݱ�Ż�ȡ�û�Բ��ͷ��
	 */
	public Bitmap getAvatar(int position) {
		try {
			String avatarName = mAvatars[position];
			Bitmap bitmap = null;
			if (mAvatarCache.containsKey(avatarName)) {
				SoftReference<Bitmap> reference = mAvatarCache.get(avatarName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = PhotoUtil.toRoundCorner(
					BitmapFactory.decodeStream(getAssets().open(
							"avatar/" + avatarName)), 15);
			mAvatarCache.put(avatarName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return mDefault_Avatar;
		}
	}

	/**
	 * ���ݱ�Ż�ȡ�û�Ĭ��ͷ��
	 */
	public Bitmap getDefaultAvatar(int position) {
		try {
			String avatarName = mAvatars[position];
			Bitmap bitmap = null;
			if (mDefaultAvatarCache.containsKey(avatarName)) {
				SoftReference<Bitmap> reference = mDefaultAvatarCache
						.get(avatarName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"avatar/" + avatarName));
			mDefaultAvatarCache.put(avatarName, new SoftReference<Bitmap>(
					bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory
					.decodeResource(getResources(), R.drawable.head);
		}
	}

	/**
	 * ���ݱ�Ż�ȡ������ҳͷ��
	 */
	public Bitmap getPublicPageAvatar(int position) {
		try {
			String avatarName = mPublicPageAvatars[position];
			Bitmap bitmap = null;
			if (mPublicPageAvatarCache.containsKey(avatarName)) {
				SoftReference<Bitmap> reference = mPublicPageAvatarCache
						.get(avatarName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = PhotoUtil.toRoundCorner(
					BitmapFactory.decodeStream(getAssets().open(
							"publicpage_avatar/" + avatarName)), 15);
			mPublicPageAvatarCache.put(avatarName, new SoftReference<Bitmap>(
					bitmap));
			return bitmap;
		} catch (Exception e) {
			return mDefault_Avatar;
		}
	}

	/**
	 * ���ݱ�Ż�ȡ��Ƭ
	 */
	public Bitmap getPhoto(int position) {
		try {
			String photosName = mPhotosName[position];
			Bitmap bitmap = null;
			if (mPhotoCache.containsKey(photosName)) {
				SoftReference<Bitmap> reference = mPhotoCache.get(photosName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"photo/" + photosName));
			mPhotoCache.put(photosName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return mDefault_Photo;
		}
	}

	/**
	 * ���ݱ�Ż�ȡת��ͼƬ
	 */
	public Bitmap getViewed(int position) {
		try {
			String viewedName = mViewedName[position];
			Bitmap bitmap = null;
			if (mViewedCache.containsKey(viewedName)) {
				SoftReference<Bitmap> reference = mViewedCache.get(viewedName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"viewed/" + viewedName));
			mViewedCache.put(viewedName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.picture_default_fg);
		}
	}

	/**
	 * ���ݱ�Ż�ȡ����ת��ͼƬ
	 */
	public Bitmap getViewedHot(int position) {
		try {
			String viewedHotName = mViewedHotName[position];
			Bitmap bitmap = null;
			if (mViewedHotCache.containsKey(viewedHotName)) {
				SoftReference<Bitmap> reference = mViewedHotCache
						.get(viewedHotName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"viewed_hot/" + viewedHotName));
			mViewedHotCache.put(viewedHotName,
					new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.picture_default_fg);
		}
	}

	/**
	 * ���ݱ�����ƻ�ȡ��ϷͼƬ
	 */
	public Bitmap getRecommend(String position) {
		try {
			String recommendName = "icon_" + position + ".jpg";
			Bitmap bitmap = null;
			if (mRecommendCache.containsKey(recommendName)) {
				SoftReference<Bitmap> reference = mRecommendCache
						.get(recommendName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"recommend/" + recommendName));
			mRecommendCache.put(recommendName,
					new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * ����ͼƬ���ƻ�ȡ������Ƭ��ͼƬ
	 */
	public Bitmap getNearbyPhoto(String position) {
		try {
			String nearbyPhotoName = position + ".jpg";
			Bitmap bitmap = null;
			if (mNearbyPhoto.containsKey(nearbyPhotoName)) {
				SoftReference<Bitmap> reference = mNearbyPhoto
						.get(nearbyPhotoName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"nearby_photo/" + nearbyPhotoName));
			mNearbyPhoto
					.put(nearbyPhotoName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.lbs_checkin_photo_icon);
		}
	}

	/**
	 * ���ݱ�Ż�ȡ����ͼƬ
	 */
	public Bitmap getFaceBitmap(int position) {
		try {
			String faceName = mFacesText.get(position);
			Bitmap bitmap = null;
			if (mFaceCache.containsKey(faceName)) {
				SoftReference<Bitmap> reference = mFaceCache.get(faceName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeResource(getResources(),
					mFaces[position]);
			mFaceCache.put(faceName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * ���������Ż�ȡ����ͼƬ
	 */
	public Bitmap getGift(String gid) {
		try {
			Bitmap bitmap = null;
			if (mGiftsCache.containsKey(gid)) {
				SoftReference<Bitmap> reference = mGiftsCache.get(gid);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets()
					.open("gifts/" + gid));
			mGiftsCache.put(gid, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.gifts_default_01);
		}
	}

	/**
	 * ���ݵ�ַ��ȡ�ֻ�SD��ͼƬ
	 */
	public Bitmap getPhoneAlbum(String path) {
		Bitmap bitmap = null;
		if (mPhoneAlbumCache.containsKey(path)) {
			SoftReference<Bitmap> reference = mPhoneAlbumCache.get(path);
			bitmap = reference.get();
			if (bitmap != null) {
				return bitmap;
			}
		}
		bitmap = BitmapFactory.decodeFile(path);
		mPhoneAlbumCache.put(path, new SoftReference<Bitmap>(bitmap));
		return bitmap;
	}
}
