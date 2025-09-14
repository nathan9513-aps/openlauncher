#!/usr/bin/env bash
set -euo pipefail

# Creates keystore.jks in the repository root with alias key1 and the provided password.
# Usage: ./scripts/create-keystore.sh

KEYSTORE=keystore.jks
ALIAS=key1
STOREPASS='Dennisd-401!'
KEYPASS='Dennisd-401!'

if ! command -v keytool >/dev/null 2>&1; then
  echo "Error: keytool not found. Install JDK or set JAVA_HOME." >&2
  exit 2
fi

if [ -f "$KEYSTORE" ]; then
  echo "Keystore '$KEYSTORE' already exists. Aborting to avoid overwrite." >&2
  exit 3
fi

keytool -genkeypair -v -storetype JKS -keystore "$KEYSTORE" -alias "$ALIAS" -keyalg RSA -keysize 2048 -validity 10000 \
  -storepass "$STOREPASS" -keypass "$KEYPASS" -dname 'CN=OpenLauncher, OU=Dev, O=OpenLauncher, L=Unknown, S=Unknown, C=US'

chmod 600 "$KEYSTORE"
echo "Created $KEYSTORE with alias $ALIAS"
