package com;

import java.sql.Time;

import javax.xml.crypto.Data;

public class Shop {

	private long id ;
	private String name ;
	//private String email ;
	private String domain ;
	private String province ;
	private String country ;
	private String address1 ;
	private String zip ;
	private String city ;
	private String source ;
	private String phone ;
	private String latitude ;
	private String longitude ;
	private String primary_locale ;
	private String address2 ;
	private Data created_at ;
	private Data updated_at ;
	private String country_code ;
	private String country_name ;
	private String currency ;
	private String customer_email ;
	private Time timezone ;
	private String iana_timezone ;
	private String shop_owner ;
	private String money_format ;
	private String money_with_currency_format ;
	private String weight_unit ;
	private String province_code ;
	private Boolean taxes_included ;
	private Boolean auto_configure_tax_inclusivity ;
	private Boolean tax_shipping ;
	private Boolean county_taxes ;
	private String plan_display_name ;
	private String plan_name ;
	private Boolean has_discounts ;
	private Boolean has_gift_cards ;
	private String myshopify_domain ;
	private String google_apps_domain ;
	private String google_apps_login_enabled ;
	private String money_in_emails_format ;
	private String money_with_currency_in_emails_format ;
	private Boolean eligible_for_payments ;
	private Boolean requires_extra_payments_agreement ;
	private Boolean password_enabled ;
	private Boolean has_storefront ;
	private Boolean eligible_for_card_reader_giveaway ;
	private Boolean finances ;
	private String primary_location_id ;
	private String cookie_consent_level ;
	private String visitor_tracking_consent_preference ;
	private Boolean checkout_api_supported ;
	private Boolean multi_location_enabled ;
	private Boolean setup_required ;
	private Boolean pre_launch_enabled ;
	private String enabled_presentment_currencies ;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public String getEmail() {
	//	return email;
	//}
	//public void setEmail(String email) {
	//	this.email = email;
	//}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getPrimary_locale() {
		return primary_locale;
	}
	public void setPrimary_locale(String primary_locale) {
		this.primary_locale = primary_locale;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public Data getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Data created_at) {
		this.created_at = created_at;
	}
	public Data getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Data updated_at) {
		this.updated_at = updated_at;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public Time getTimezone() {
		return timezone;
	}
	public void setTimezone(Time timezone) {
		this.timezone = timezone;
	}
	public String getIana_timezone() {
		return iana_timezone;
	}
	public void setIana_timezone(String iana_timezone) {
		this.iana_timezone = iana_timezone;
	}
	public String getShop_owner() {
		return shop_owner;
	}
	public void setShop_owner(String shop_owner) {
		this.shop_owner = shop_owner;
	}
	public String getMoney_format() {
		return money_format;
	}
	public void setMoney_format(String money_format) {
		this.money_format = money_format;
	}
	public String getMoney_with_currency_format() {
		return money_with_currency_format;
	}
	public void setMoney_with_currency_format(String money_with_currency_format) {
		this.money_with_currency_format = money_with_currency_format;
	}
	public String getWeight_unit() {
		return weight_unit;
	}
	public void setWeight_unit(String weight_unit) {
		this.weight_unit = weight_unit;
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public Boolean getTaxes_included() {
		return taxes_included;
	}
	public void setTaxes_included(Boolean taxes_included) {
		this.taxes_included = taxes_included;
	}
	public Boolean getAuto_configure_tax_inclusivity() {
		return auto_configure_tax_inclusivity;
	}
	public void setAuto_configure_tax_inclusivity(Boolean auto_configure_tax_inclusivity) {
		this.auto_configure_tax_inclusivity = auto_configure_tax_inclusivity;
	}
	public Boolean getTax_shipping() {
		return tax_shipping;
	}
	public void setTax_shipping(Boolean tax_shipping) {
		this.tax_shipping = tax_shipping;
	}
	public Boolean getCounty_taxes() {
		return county_taxes;
	}
	public void setCounty_taxes(Boolean county_taxes) {
		this.county_taxes = county_taxes;
	}
	public String getPlan_display_name() {
		return plan_display_name;
	}
	public void setPlan_display_name(String plan_display_name) {
		this.plan_display_name = plan_display_name;
	}
	public String getPlan_name() {
		return plan_name;
	}
	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}
	public Boolean getHas_discounts() {
		return has_discounts;
	}
	public void setHas_discounts(Boolean has_discounts) {
		this.has_discounts = has_discounts;
	}
	public Boolean getHas_gift_cards() {
		return has_gift_cards;
	}
	public void setHas_gift_cards(Boolean has_gift_cards) {
		this.has_gift_cards = has_gift_cards;
	}
	public String getMyshopify_domain() {
		return myshopify_domain;
	}
	public void setMyshopify_domain(String myshopify_domain) {
		this.myshopify_domain = myshopify_domain;
	}
	public String getGoogle_apps_domain() {
		return google_apps_domain;
	}
	public void setGoogle_apps_domain(String google_apps_domain) {
		this.google_apps_domain = google_apps_domain;
	}
	public String getGoogle_apps_login_enabled() {
		return google_apps_login_enabled;
	}
	public void setGoogle_apps_login_enabled(String google_apps_login_enabled) {
		this.google_apps_login_enabled = google_apps_login_enabled;
	}
	public String getMoney_in_emails_format() {
		return money_in_emails_format;
	}
	public void setMoney_in_emails_format(String money_in_emails_format) {
		this.money_in_emails_format = money_in_emails_format;
	}
	public String getMoney_with_currency_in_emails_format() {
		return money_with_currency_in_emails_format;
	}
	public void setMoney_with_currency_in_emails_format(String money_with_currency_in_emails_format) {
		this.money_with_currency_in_emails_format = money_with_currency_in_emails_format;
	}
	public Boolean getEligible_for_payments() {
		return eligible_for_payments;
	}
	public void setEligible_for_payments(Boolean eligible_for_payments) {
		this.eligible_for_payments = eligible_for_payments;
	}
	public Boolean getRequires_extra_payments_agreement() {
		return requires_extra_payments_agreement;
	}
	public void setRequires_extra_payments_agreement(Boolean requires_extra_payments_agreement) {
		this.requires_extra_payments_agreement = requires_extra_payments_agreement;
	}
	public Boolean getPassword_enabled() {
		return password_enabled;
	}
	public void setPassword_enabled(Boolean password_enabled) {
		this.password_enabled = password_enabled;
	}
	public Boolean getHas_storefront() {
		return has_storefront;
	}
	public void setHas_storefront(Boolean has_storefront) {
		this.has_storefront = has_storefront;
	}
	public Boolean getEligible_for_card_reader_giveaway() {
		return eligible_for_card_reader_giveaway;
	}
	public void setEligible_for_card_reader_giveaway(Boolean eligible_for_card_reader_giveaway) {
		this.eligible_for_card_reader_giveaway = eligible_for_card_reader_giveaway;
	}
	public Boolean getFinances() {
		return finances;
	}
	public void setFinances(Boolean finances) {
		this.finances = finances;
	}
	public String getPrimary_location_id() {
		return primary_location_id;
	}
	public void setPrimary_location_id(String primary_location_id) {
		this.primary_location_id = primary_location_id;
	}
	public String getCookie_consent_level() {
		return cookie_consent_level;
	}
	public void setCookie_consent_level(String cookie_consent_level) {
		this.cookie_consent_level = cookie_consent_level;
	}
	public String getVisitor_tracking_consent_preference() {
		return visitor_tracking_consent_preference;
	}
	public void setVisitor_tracking_consent_preference(String visitor_tracking_consent_preference) {
		this.visitor_tracking_consent_preference = visitor_tracking_consent_preference;
	}
	public Boolean getCheckout_api_supported() {
		return checkout_api_supported;
	}
	public void setCheckout_api_supported(Boolean checkout_api_supported) {
		this.checkout_api_supported = checkout_api_supported;
	}
	public Boolean getMulti_location_enabled() {
		return multi_location_enabled;
	}
	public void setMulti_location_enabled(Boolean multi_location_enabled) {
		this.multi_location_enabled = multi_location_enabled;
	}
	public Boolean getSetup_required() {
		return setup_required;
	}
	public void setSetup_required(Boolean setup_required) {
		this.setup_required = setup_required;
	}
	public Boolean getPre_launch_enabled() {
		return pre_launch_enabled;
	}
	public void setPre_launch_enabled(Boolean pre_launch_enabled) {
		this.pre_launch_enabled = pre_launch_enabled;
	}
	public String getEnabled_presentment_currencies() {
		return enabled_presentment_currencies;
	}
	public void setEnabled_presentment_currencies(String enabled_presentment_currencies) {
		this.enabled_presentment_currencies = enabled_presentment_currencies;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + ", domain=" + domain + ", province="
				+ province + ", country=" + country + ", address1=" + address1 + ", zip=" + zip + ", city=" + city
				+ ", source=" + source + ", phone=" + phone + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", primary_locale=" + primary_locale + ", address2=" + address2 + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + ", country_code=" + country_code + ", country_name=" + country_name
				+ ", currency=" + currency + ", customer_email=" + customer_email + ", timezone=" + timezone
				+ ", iana_timezone=" + iana_timezone + ", shop_owner=" + shop_owner + ", money_format=" + money_format
				+ ", money_with_currency_format=" + money_with_currency_format + ", weight_unit=" + weight_unit
				+ ", province_code=" + province_code + ", taxes_included=" + taxes_included
				+ ", auto_configure_tax_inclusivity=" + auto_configure_tax_inclusivity + ", tax_shipping="
				+ tax_shipping + ", county_taxes=" + county_taxes + ", plan_display_name=" + plan_display_name
				+ ", plan_name=" + plan_name + ", has_discounts=" + has_discounts + ", has_gift_cards=" + has_gift_cards
				+ ", myshopify_domain=" + myshopify_domain + ", google_apps_domain=" + google_apps_domain
				+ ", google_apps_login_enabled=" + google_apps_login_enabled + ", money_in_emails_format="
				+ money_in_emails_format + ", money_with_currency_in_emails_format="
				+ money_with_currency_in_emails_format + ", eligible_for_payments=" + eligible_for_payments
				+ ", requires_extra_payments_agreement=" + requires_extra_payments_agreement + ", password_enabled="
				+ password_enabled + ", has_storefront=" + has_storefront + ", eligible_for_card_reader_giveaway="
				+ eligible_for_card_reader_giveaway + ", finances=" + finances + ", primary_location_id="
				+ primary_location_id + ", cookie_consent_level=" + cookie_consent_level
				+ ", visitor_tracking_consent_preference=" + visitor_tracking_consent_preference
				+ ", checkout_api_supported=" + checkout_api_supported + ", multi_location_enabled="
				+ multi_location_enabled + ", setup_required=" + setup_required + ", pre_launch_enabled="
				+ pre_launch_enabled + ", enabled_presentment_currencies=" + enabled_presentment_currencies + "]";
	}

	
}
