/*
 * DoubleClue REST API
 * DoubleClue URL http://yourhost:8001/dcem/restApi/as
 *
 * OpenAPI spec version: 1.5.0
 * Contact: emanuel.galea@hws-gruppe.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.doubleclue.dcem.as.restapi.model;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AsApiUrlToken
 */

public class AsApiUrlToken implements Serializable {
	@JsonProperty("url")
	private String url = null;

	@JsonProperty("validMinutes")
	private int validMinutes = 0;

	@JsonProperty("username")
	private String username = null;

	@JsonProperty("token")
	private String token = null;

	@JsonProperty("urlTokenUsage")
	private AsApiUrlTokenUsage urlTokenUsage = null;

	public AsApiUrlToken url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * Get url
	 * @return url
	 **/
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public AsApiUrlToken validMinutes(int validMinutes) {
		this.validMinutes = validMinutes;
		return this;
	}

	/**
	 * Get validMinutes
	 * @return validMinutes
	 **/
	@JsonProperty("validMinutes")
	public int getValidMinutes() {
		return validMinutes;
	}

	public void setValidMinutes(int validMinutes) {
		this.validMinutes = validMinutes;
	}

	public AsApiUrlToken username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get username
	 * @return username
	 **/
	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public AsApiUrlToken token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * Get token
	 * @return token
	 **/
	@JsonProperty("token")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public AsApiUrlToken urlTokenUsage(AsApiUrlTokenUsage urlTokenUsage) {
		this.urlTokenUsage = urlTokenUsage;
		return this;
	}

	/**
	 * Get urlTokenUsage
	 * @return urlTokenUsage
	 **/
	@JsonProperty("urlTokenUsage")
	public AsApiUrlTokenUsage getUrlTokenUsage() {
		return urlTokenUsage;
	}

	public void setUrlTokenUsage(AsApiUrlTokenUsage urlTokenUsage) {
		this.urlTokenUsage = urlTokenUsage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AsApiUrlToken asApiUrlToken = (AsApiUrlToken) o;
		return Objects.equals(this.url, asApiUrlToken.url) && Objects.equals(this.validMinutes, asApiUrlToken.validMinutes) && Objects
				.equals(this.username, asApiUrlToken.username) && Objects.equals(this.token, asApiUrlToken.token) && Objects
				.equals(this.urlTokenUsage, asApiUrlToken.urlTokenUsage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(url, validMinutes, username, token, urlTokenUsage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AsApiUrlToken {\n");

		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    validMinutes: ").append(toIndentedString(validMinutes)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    urlTokenUsage: ").append(toIndentedString(urlTokenUsage)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}

