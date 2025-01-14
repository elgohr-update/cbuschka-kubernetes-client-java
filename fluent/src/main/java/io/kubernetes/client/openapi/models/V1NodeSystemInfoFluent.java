package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public interface V1NodeSystemInfoFluent<A extends io.kubernetes.client.openapi.models.V1NodeSystemInfoFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  public java.lang.String getArchitecture();
  public A withArchitecture(java.lang.String architecture);
  public java.lang.Boolean hasArchitecture();
  
  /**
   * Method is deprecated. use withArchitecture instead.
   */
  @java.lang.Deprecated
  public A withNewArchitecture(java.lang.String arg0);
  public java.lang.String getBootID();
  public A withBootID(java.lang.String bootID);
  public java.lang.Boolean hasBootID();
  
  /**
   * Method is deprecated. use withBootID instead.
   */
  @java.lang.Deprecated
  public A withNewBootID(java.lang.String arg0);
  public java.lang.String getContainerRuntimeVersion();
  public A withContainerRuntimeVersion(java.lang.String containerRuntimeVersion);
  public java.lang.Boolean hasContainerRuntimeVersion();
  
  /**
   * Method is deprecated. use withContainerRuntimeVersion instead.
   */
  @java.lang.Deprecated
  public A withNewContainerRuntimeVersion(java.lang.String arg0);
  public java.lang.String getKernelVersion();
  public A withKernelVersion(java.lang.String kernelVersion);
  public java.lang.Boolean hasKernelVersion();
  
  /**
   * Method is deprecated. use withKernelVersion instead.
   */
  @java.lang.Deprecated
  public A withNewKernelVersion(java.lang.String arg0);
  public java.lang.String getKubeProxyVersion();
  public A withKubeProxyVersion(java.lang.String kubeProxyVersion);
  public java.lang.Boolean hasKubeProxyVersion();
  
  /**
   * Method is deprecated. use withKubeProxyVersion instead.
   */
  @java.lang.Deprecated
  public A withNewKubeProxyVersion(java.lang.String arg0);
  public java.lang.String getKubeletVersion();
  public A withKubeletVersion(java.lang.String kubeletVersion);
  public java.lang.Boolean hasKubeletVersion();
  
  /**
   * Method is deprecated. use withKubeletVersion instead.
   */
  @java.lang.Deprecated
  public A withNewKubeletVersion(java.lang.String arg0);
  public java.lang.String getMachineID();
  public A withMachineID(java.lang.String machineID);
  public java.lang.Boolean hasMachineID();
  
  /**
   * Method is deprecated. use withMachineID instead.
   */
  @java.lang.Deprecated
  public A withNewMachineID(java.lang.String arg0);
  public java.lang.String getOperatingSystem();
  public A withOperatingSystem(java.lang.String operatingSystem);
  public java.lang.Boolean hasOperatingSystem();
  
  /**
   * Method is deprecated. use withOperatingSystem instead.
   */
  @java.lang.Deprecated
  public A withNewOperatingSystem(java.lang.String arg0);
  public java.lang.String getOsImage();
  public A withOsImage(java.lang.String osImage);
  public java.lang.Boolean hasOsImage();
  
  /**
   * Method is deprecated. use withOsImage instead.
   */
  @java.lang.Deprecated
  public A withNewOsImage(java.lang.String arg0);
  public java.lang.String getSystemUUID();
  public A withSystemUUID(java.lang.String systemUUID);
  public java.lang.Boolean hasSystemUUID();
  
  /**
   * Method is deprecated. use withSystemUUID instead.
   */
  @java.lang.Deprecated
  public A withNewSystemUUID(java.lang.String arg0);
  
}