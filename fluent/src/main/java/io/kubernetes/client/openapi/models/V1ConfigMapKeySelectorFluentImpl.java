package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1ConfigMapKeySelectorFluentImpl<A extends io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1ConfigMapKeySelectorFluent<A>{
  public V1ConfigMapKeySelectorFluentImpl() {
  }
  public V1ConfigMapKeySelectorFluentImpl(io.kubernetes.client.openapi.models.V1ConfigMapKeySelector instance) {
    this.withKey(instance.getKey());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

  }
  private java.lang.String key;
  private java.lang.String name;
  private java.lang.Boolean optional;
  public java.lang.String getKey() {
    return this.key;
  }
  public A withKey(java.lang.String key) {
    this.key=key; return (A) this;
  }
  public java.lang.Boolean hasKey() {
    return this.key != null;
  }
  
  /**
   * Method is deprecated. use withKey instead.
   */
  @java.lang.Deprecated
  public A withNewKey(java.lang.String arg0) {
    return (A)withKey(new String(arg0));
  }
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0) {
    return (A)withName(new String(arg0));
  }
  public java.lang.Boolean getOptional() {
    return this.optional;
  }
  public A withOptional(java.lang.Boolean optional) {
    this.optional=optional; return (A) this;
  }
  public java.lang.Boolean hasOptional() {
    return this.optional != null;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1ConfigMapKeySelectorFluentImpl that = (V1ConfigMapKeySelectorFluentImpl) o;
    if (key != null ? !key.equals(that.key) :that.key != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (optional != null ? !optional.equals(that.optional) :that.optional != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(key,  name,  optional,  super.hashCode());
  }
  
}